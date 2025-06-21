package ECommerceSearchFunction;
import java.util.Arrays;
import java.util.Comparator;

public class ProductSearch {
	public static int linearSearch(Product[] products, int targetId) {
		for(int i=0;i<products.length;i++) {
			if(products[i].productId==targetId) {
				return i;
			}
			
		}
		return -1;
		
		
	}
	public static int binarySearch(Product[] products,int targetId) {
		int s=0;
		int e=products.length-1;
		while(s<=e) {
			int mid=s+(e-s)/2;
			if(products[mid].productId<targetId) {
				s=mid+1;
			}
			else if(products[mid].productId>targetId) {
				e=mid-1;
			}
			else {
				return mid;
			}
		}
		return -1;
		
	}
	public static void sortProductsById(Product[] products) {
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));
    }


}
