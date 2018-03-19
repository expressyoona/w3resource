import java.util.Arrays;
import java.util.Scanner;

public class DataType_9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input first number ");
		int a = kb.nextInt();
		System.out.print("Input second number: ");
		int b = kb.nextInt();
		System.out.println("Sum of two integers: "+(a+b));
		System.out.println("Different of two integers: "+Math.abs(a-b));
		System.out.println("Product of two integers: "+(a*b));
		System.out.println("Average of two integers: "+(a+b)/2);
		System.out.println("Distance of two integers: "+(b - a));
		int Max = (a > b)?a:b;
		int Min = (a < b)?a:b;
		System.out.println("Max integer: "+Max);
		System.out.println("Min integer: "+Min);
	}
}


