package myPackage2;
import java.util.Scanner;

public class M1_Activity2 {
	public static void main(String args[]) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        // Ask for input
        System.out.print("Enter your Age:");
        String ageStr = sc.nextLine();
        int AgeI = Integer.valueOf(ageStr);
        double AgeD = Double.valueOf(AgeI);
        // Output
        System.out.println(AgeI);
        System.out.println(AgeD);
  }
}
