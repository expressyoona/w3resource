import java.util.Scanner;

public class Basic_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input first number: ");
		int a = kb.nextInt();
		System.out.print("Input second number: ");
		int b = kb.nextInt();
		if (a > b)
			System.out.println(a + " > " + b);
		if (a >= b)
			System.out.println(a + " >= " + b);
		if (a < b)
			System.out.println(a + " < " + b);
		if (a <= b)
			System.out.println(a + " <= " + b);
		if (a == b)
			System.out.println(a + " = " + b);
		if (a != b)
			System.out.println(a + " != " + b);
	}

}
