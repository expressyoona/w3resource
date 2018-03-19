import java.util.Scanner;

public class Basic_63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input first number: ");
		int a = kb.nextInt();
		System.out.print("Input second number: ");
		int b = kb.nextInt();
		int t;
		if (a == b) t = 0;
		else if (a % 6 == b % 6) t = (a > b)?b:a;
		else t = (a > b)?a:b;
		System.out.print(t);
	}

}
