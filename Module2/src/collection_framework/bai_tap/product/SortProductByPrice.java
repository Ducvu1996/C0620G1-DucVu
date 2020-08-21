package collection_framework.bai_tap.product;

import java.util.Comparator;

public class SortProductByPrice implements Comparator<Product> {

	@Override
	public int compare(Product product_1, Product product_2) {
		if (product_1.getPrice() > product_2.getPrice()) {
            return 1;
        }
        return -1;
	
	}

}
