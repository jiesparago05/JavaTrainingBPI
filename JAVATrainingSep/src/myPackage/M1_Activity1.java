package myPackage;
import java.util.Scanner;


public class M1_Activity1 {
	public static void main(String args[]) {
        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Ask for input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        // Output
        System.out.println("Hello, " + name + "!");
  }
}
