//package einstein.cutandcolored.data.tags;
//
//import java.nio.file.Path;
//
//import net.minecraft.core.Registry;
//import net.minecraft.data.DataGenerator;
//import net.minecraft.data.tags.TagsProvider;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.tags.Tag;
//import net.minecraftforge.common.data.ExistingFileHelper;
//
//public abstract class ModTagsProvider<T> extends TagsProvider<T> {
//
//	protected ModTagsProvider(DataGenerator p_126546_, Registry<T> p_126547_, String modId, ExistingFileHelper existingFileHelper) {
//		super(p_126546_, p_126547_, modId, existingFileHelper);
//	}
//
//	protected TagAppender<T> tag2(Tag.Named<T> p_126549_) {
//		Tag.Builder tag$builder = this.getOrCreateRawBuilder2(p_126549_);
//		return new TagAppender<T>(tag$builder, registry, modId);
//	}
//
//	protected Tag.Builder getOrCreateRawBuilder2(Tag.Named<T> p_126563_) {
//		return this.builders.computeIfAbsent(p_126563_.getName(), (p_176838_) -> {
////			existingFileHelper.trackGenerated(p_176838_, resourceType);
//			return new Tag.Builder();
//		});
//	}
//}
