package product;
import java.util.HashMap;
import java.util.Map;


public class ProductList {

	private final Map<Product, Integer> products = new HashMap<>();

	public void add(Product product, int kg){
		if (products.containsKey(product)){
			throw new IllegalArgumentException("Такой продукт уже есть");
		}
		products.put(product, kg);
	}

	public void add (Product product){
		add(product, 1);
	}
	public void remove(Product product) {
		products.remove(product);
	}

}
