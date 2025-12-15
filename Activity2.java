package M3_Activity2;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Activity2 {
public static void main(String[] args) {
		
		Set<String> products = new HashSet<>();
		
		products.add("Laptop");
		products.add("Mouse");
		products.add("Keyboard");
		products.add("Monitor");
		products.add("Printer");
		
		Scanner sc = new Scanner(System.in);
		int option;
		
		do {
			System.out.println("\nSelect an option:");
			System.out.println("1. Search a product");
			System.out.println("2. Add a product");
			System.out.println("3. Print all products and count");
			System.out.println("4. Exit");
			System.out.print("> ");
			
		while (!sc.hasNextInt()) {
			sc.nextLine();
			
			System.out.print("> ");
			
		}
		option = sc.nextInt();
		sc.nextLine();
		
		switch (option) {
		case 1 -> {
			System.out.print("Enter product name to search: ");
			String search = sc.nextLine();
			
			if (products.contains(search)) {
				System.out.println("Product found: " + search);
			}else {
				System.out.println("Product not found!");
			}
		}
		case 2 -> {
			System.out.print("Enter product name to add: ");
			String add = sc.nextLine();
			products.add(add);
				
			System.out.println("Product added: " + add);
			
		}
		case 3 -> {
			System.out.println("\nAll products:");
			for (String p : products) {
				System.out.println(p);
				
			}
			
			System.out.println("Total unique products: " + products.size());
			
		}
		case 4 -> System.out.println("Exiting...");
		
		default -> System.out.println("Invalid option!");
		
		}
		
		}while(option != 4);
		
			sc.close();
		}
}
