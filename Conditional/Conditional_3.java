import java.util.Arrays;
import java.util.Scanner;

public class Conditional_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input 1st number: ");
		int a = kb.nextInt();
		int Max = a;
		System.out.print("Input 2nd number: ");
		int b = kb.nextInt();
		Max = (b > Max)?b:Max;
		System.out.print("Input 3rd number: ");
		int c = kb.nextInt();
		Max = (c > Max)?c:Max;
		System.out.println("The greatest is: "+Max);
	}
}


