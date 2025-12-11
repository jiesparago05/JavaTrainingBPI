package myPackage4;
import java.util.Scanner;
public class M1_Activity4 {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age:");
        int age = sc.nextInt();
 
        if (age < 18 ){
          System.out.println("Minor");
        }
        else if (age >= 18 && age <= 59){
          System.out.println("Adult");
        }
        else{
          System.out.println("Senior");
        }
  }
}
