package ECommerceSearchFunction;

public class Main {
	public static void main(String[] args) {
		Product[] products = {
	            new Product(103, "Keyboard", "Electronics"),
	            new Product(101, "Laptop", "Electronics"),
	            new Product(105, "Book", "Books"),
	            new Product(102, "Phone", "Electronics"),
	            new Product(104, "Shoes", "Footwear")
	        };

	        
	        int index1 = ProductSearch.linearSearch(products, 104);
	        System.out.println("Linear Search Found at index: " + index1);

	        ProductSearch.sortProductsById(products);
	        
	        int index2 = ProductSearch.binarySearch(products, 104);
	        System.out.println("Binary Search Found at index: " + index2);
		
	}

}
