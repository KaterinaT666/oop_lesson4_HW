package product;

import java.util.Objects;

public class Product {
	private String nameProduct;
	private double cost;
	private int kg;

	public Product(String nameProduct,
				   double cost,
				   int kg) {
		setNameProduct(nameProduct);
		setCost(cost);
		setKg(kg);
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		if (nameProduct == null || nameProduct.isEmpty()){
			throw new IllegalArgumentException("Заполните карточку товара полностью.");
		}
		this.nameProduct = nameProduct;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		if (cost<= 0){
			throw new IllegalArgumentException("Заполните карточку товара полностью.");
		}
		this.cost = cost;
	}

	public int getKg() {
		return kg;
	}

	public void setKg(int kg) {
		if (kg <= 0 ) {
			throw new IllegalArgumentException("Заполните карточку товара полностью.");
		}
		this.kg = kg;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Product product = (Product) o;
		return getNameProduct().equals(product.getNameProduct());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getNameProduct());
	}
}
