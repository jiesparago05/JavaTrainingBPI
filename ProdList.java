package M3_Activity1;
import java.util.LinkedList;
import java.util.Scanner;


public class ProdList {
	public static void main(String[] args) {
		
		LinkedList<String> products = new LinkedList<>();
		
		products.add("Laptop");
		products.add("Mouse");
		products.add("Keyboard");
		products.add("Monitor");
		products.add("Printer");
		
		System.out.println("All products:");
		
		for (int i = 0; i < products.size();i++) {
			System.out.println((i + 1) + "." + products.get(i));
		}
		
		products.add("Webcam");
		products.remove("Mouse");
		System.out.println(" ");
		System.out.println("All products:");
		for (int i  = 0; i < products.size();i++) {
			System.out.println((i + 1) + "." + products.get(i));
		}
		
		System.out.println(" ");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter product name to search: ");
		String search = scanner.nextLine();
		
		boolean found = false;

		for (String product : products) {
		    if (product.equalsIgnoreCase(search)) {
		        System.out.println("Product found: " + product);
		        found = true;
		        break;
		    }
		}

		if (!found) {
		    System.out.println("Product not found.");
		}

		 
	    scanner.close();
		
}
}
