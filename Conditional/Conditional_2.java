import java.util.Arrays;
import java.util.Scanner;

public class Conditional_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a: ");
		int a = kb.nextInt();
		System.out.print("Input b: ");
		int b = kb.nextInt();
		System.out.print("Input c: ");
		int c = kb.nextInt();
		float f1 = (-b + (float)Math.sqrt(b*b-4*a*c))/(2*a);
		float f2 = (-b - (float)Math.sqrt(b*b-4*a*c))/(2*a);
		System.out.println("The roots are "+f1+" and "+f2);
	}
}


