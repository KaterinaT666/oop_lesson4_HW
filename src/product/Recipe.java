package product;

import java.util.*;

public class Recipe {

	private final Map<Product, Integer> products;
	private String nameRecipe;
	private double totalCost;

	public Recipe(String nameRecipe) {
		this.nameRecipe = nameRecipe;
		this.totalCost = 0;
		this.products = new HashMap<>();
	}

	public void add(Product product, int kg){
		if (products.containsKey(product)){
			throw new IllegalArgumentException("Такой продукт уже есть");
		}
		products.put(product, kg);
		totalCost += kg * product.getCost();
	}

	public void add(Product product){
		add(product, 1);

	}

	public String getNameRecipe() {
		return nameRecipe;
	}

	public double getTotalCost() {
		return totalCost;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Recipe recipe = (Recipe) o;
		return getNameRecipe().equals(recipe.getNameRecipe());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getNameRecipe());
	}
}
