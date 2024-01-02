package com.rrk.oopsVisited.inheritance;

public class RecipeRunner {
	public static void main(String[] args) {

		Recipe1 recipe = new Recipe1();
		recipe.execute();
		
		Recipe2 recipeWithMicrowave = new Recipe2();
		recipeWithMicrowave.execute();
	}
}
