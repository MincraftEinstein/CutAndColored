package einstein.cutandcolored.jei;

import java.util.ArrayList;

public class RecipeWrapper {

	private ArrayList input;
	private ArrayList output;

	public RecipeWrapper(ArrayList input, ArrayList output) {
        this.input = input;
        this.output = output;
    }

	public ArrayList getInput() {
		return input;
	}

	public ArrayList getOutput() {
		return output;
	}

}
