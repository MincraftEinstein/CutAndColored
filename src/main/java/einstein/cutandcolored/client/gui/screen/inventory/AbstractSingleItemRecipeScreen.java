package einstein.cutandcolored.client.gui.screen.inventory;

import java.util.List;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;

import einstein.cutandcolored.inventory.container.AbstractSingleItemRecipeMenu;
import einstein.cutandcolored.item.crafting.AbstractSingleItemRecipe;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.resources.sounds.SimpleSoundInstance;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class AbstractSingleItemRecipeScreen<T extends AbstractSingleItemRecipeMenu<R>, R extends AbstractSingleItemRecipe> extends AbstractContainerScreen<T> {

	private float scrollOffs;
	private boolean scrolling;
	private int startIndex;
	private boolean displayRecipes;
	
	public AbstractSingleItemRecipeScreen(T menu, Inventory inventory, Component component) {
		super(menu, inventory, component);
		menu.registerUpdateListener(this::containerChanged);
		--titleLabelY;
	}
	
	protected abstract ResourceLocation getBackgroundTexture();
	
	@Override
	public void render(PoseStack stack, int mouseX, int mouseY, float partialTicks) {
		super.render(stack, mouseX, mouseY, partialTicks);
		renderTooltip(stack, mouseX, mouseY);
	}
	
	@Override
	protected void renderBg(PoseStack poseStack, float partialTicks, int x, int y) {
		this.renderBackground(poseStack);
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.setShaderTexture(0, getBackgroundTexture());
		int i = leftPos;
		int j = topPos;
		blit(poseStack, i, j, 0, 0, imageWidth, imageHeight);
		int k = (int) (41 * scrollOffs);
		blit(poseStack, i + 119, j + 15 + k, 176 + (isScrollBarActive() ? 0 : 12), 0, 12, 15);
		int l = leftPos + 52;
		int i1 = topPos + 14;
		int j1 = startIndex + 12;
		renderButtons(poseStack, x, y, l, i1, j1);
		renderRecipes(l, i1, j1);
	}
	
	@Override
	protected void renderTooltip(PoseStack poseStack, int x, int y) {
		super.renderTooltip(poseStack, x, y);
		if (displayRecipes) {
			int i = leftPos + 52;
			int j = topPos + 14;
			int k = startIndex + 12;
			List<R> list = menu.getRecipes();
			
			for (int l = startIndex; l < k && l < menu.getNumRecipes(); ++l) {
				int i1 = l - startIndex;
				int j1 = i + i1 % 4 * 16;
				int k1 = j + i1 / 4 * 18 + 2;
				if (x >= j1 && x < j1 + 16 && y >= k1 && y < k1 + 18) {
					this.renderTooltip(poseStack, list.get(l).getResultItem(), x, y);
				}
			}
		}
	}
	
	private void renderButtons(PoseStack poseStack, int x, int y, int p_99345_, int p_99346_, int p_99347_) {
		for (int i = startIndex; i < p_99347_ && i < menu.getNumRecipes(); ++i) {
			int j = i - startIndex;
			int k = p_99345_ + j % 4 * 16;
			int l = j / 4;
			int i1 = p_99346_ + l * 18 + 2;
			int j1 = imageHeight;
			if (i == menu.getSelectedRecipeIndex()) {
				j1 += 18;
			}
			else if (x >= k && y >= i1 && x < k + 16 && y < i1 + 18) {
				j1 += 36;
			}
			blit(poseStack, k, i1 - 1, 0, j1, 16, 18);
		}
	}
	
	private void renderRecipes(int left, int top, int offset) {
		List<R> list = menu.getRecipes();
		for (int i = startIndex; i < offset && i < menu.getNumRecipes(); ++i) {
			int j = i - startIndex;
			int k = left + j % 4 * 16;
			int l = j / 4;
			int i1 = top + l * 18 + 2;
			minecraft.getItemRenderer().renderAndDecorateItem(list.get(i).getResultItem(), k, i1);
		}
	}
	
	@Override
	public boolean mouseClicked(double mouseX, double mouseY, int button) {
		scrolling = false;
		if (this.displayRecipes) {
			int i = leftPos + 52;
			int j = topPos + 14;
			int k = startIndex + 12;
			
			for (int l = startIndex; l < k; ++l) {
				int i1 = l - startIndex;
				double d0 = mouseX - (i + i1 % 4 * 16);
				double d1 = mouseY - (j + i1 / 4 * 18);
				if (d0 >= 0 && d1 >= 0 && d0 < 16 && d1 < 18 && menu.clickMenuButton(minecraft.player, l)) {
					Minecraft.getInstance().getSoundManager().play(SimpleSoundInstance.forUI(SoundEvents.UI_STONECUTTER_SELECT_RECIPE, 1));
					minecraft.gameMode.handleInventoryButtonClick((menu).containerId, l);
					return true;
				}
			}
			i = leftPos + 119;
			j = topPos + 9;
			if (mouseX >= i && mouseX < (i + 12) && mouseY >= j && mouseY < (j + 54)) {
				scrolling = true;
			}
		}
		return super.mouseClicked(mouseX, mouseY, button);
	}
	
	@Override
	public boolean mouseDragged(double mouseX, double mouseY, int button, double dragX, double dragY) {
		if (scrolling && isScrollBarActive()) {
			int i = topPos + 14;
			int j = i + 54;
			scrollOffs = ((float) mouseY - (float) i - 7.5F) / ((float) (j - i) - 15);
			scrollOffs = Mth.clamp(scrollOffs, 0, 1);
			startIndex = (int) ((scrollOffs * getOffscreenRows()) + 0.5D) * 4;
			return true;
		} else {
			return super.mouseDragged(mouseX, mouseY, button, dragX, dragY);
		}
	}
	
	public boolean mouseScrolled(double mouseX, double mouseY, double delta) {
		if (isScrollBarActive()) {
			int i = getOffscreenRows();
			scrollOffs = (float) (scrollOffs - delta / i);
			scrollOffs = Mth.clamp(scrollOffs, 0, 1);
			startIndex = (int) ((scrollOffs * i) + 0.5D) * 4;
		}
		return true;
	}
	
	private boolean isScrollBarActive() {
		return displayRecipes && menu.getNumRecipes() > 12;
	}
	
	protected int getOffscreenRows() {
		return (menu.getNumRecipes() + 4 - 1) / 4 - 3;
	}
	
	private void containerChanged() {
		displayRecipes = menu.hasInputItem();
		if (!displayRecipes) {
			scrollOffs = 0;
			startIndex = 0;
		}
	}
}
