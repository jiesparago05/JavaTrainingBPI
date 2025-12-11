package myPackage3;
import java.util.Scanner;

public class M1_Activity3 {
	public static void main(String args[]) {
        int diff;
        int sum;
        int prod;
        int quo;
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter your num1:");
        int num1 = sc1.nextInt();
        System.out.print("Enter your num2:");
        int num2 = sc1.nextInt();

        diff = num1-num2;
        sum = num1+num2;
        prod = num1*num2;
        quo = num1/num2;
        
        System.out.println("diff = " + diff);
        System.out.println("sum = " + sum);
        System.out.println("prod = " + prod);
        System.out.println("quo = " + quo);
  }
}
