package M3_Activity3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class M3_Activity3 {
	 	
	 public static void main(String[] args) {

	        
	        Map<String, Integer> products = new HashMap<>();
	        
	        products.put("Laptop", 50000);
	        products.put("Monitor", 7000);
	        products.put("Mouse", 500);
	        products.put("Keyboard", 800);
	        products.put("Printer", 6000);

	        Scanner sc = new Scanner(System.in);
	        int option;

	        do {
	            System.out.println("\nSelect an option:");
	            System.out.println("1. Search a product");
	            System.out.println("2. Add a product");
	            System.out.println("3. Print all products and prices");
	            System.out.println("4. Find the cheapest product");
	            System.out.println("5. Exit");
	            System.out.print("> ");

	            while (!sc.hasNextInt()) {
	                sc.nextLine();
	                System.out.print("> ");
	            }

	            option = sc.nextInt();
	            sc.nextLine(); // consume newline

	            switch (option) {

	                case 1 -> {
	                    // Search a product
	                    System.out.print("Enter product name to search: ");
	                    String name = sc.nextLine();

	                    if (products.containsKey(name)) {
	                        System.out.println("Product found! Price: " + products.get(name));
	                    } else {
	                        System.out.println("Product not found!");
	                    }
	                }

	                case 2 -> {
	                    // Add a product
	                    System.out.print("Enter product name to add: ");
	                    String name = sc.nextLine();

	                    System.out.print("Enter product price: ");
	                    int price = sc.nextInt();
	                    sc.nextLine();

	                    products.put(name, price);
	                    System.out.println("Product added: " + name);
	                }

	                case 3 -> {
	                    // Print all products and prices
	                    System.out.println("\nAll products and prices:");
	                    for (Map.Entry<String, Integer> entry : products.entrySet()) {
	                        System.out.println(entry.getKey() + " - " + entry.getValue());
	                    }
	                    System.out.println("Total products: " + products.size());
	                }

	                case 4 -> {
	                    // Find cheapest product
	                    String cheapestProduct = null;
	                    int cheapestPrice = Integer.MAX_VALUE;

	                    for (Map.Entry<String, Integer> entry : products.entrySet()) {
	                        if (entry.getValue() < cheapestPrice) {
	                            cheapestPrice = entry.getValue();
	                            cheapestProduct = entry.getKey();
	                        }
	                    }

	                    if (cheapestProduct != null) {
	                        System.out.println("Cheapest product: " 
	                                + cheapestProduct + " - " + cheapestPrice);
	                    }
	                }

	                case 5 -> System.out.println("Exiting...");

	                default -> System.out.println("Invalid option!");
	            }

	        } while (option != 5);

	        sc.close();
	    }
}
