import java.util.Scanner;

public class Basic_64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input first number: ");
		int a = kb.nextInt();
		System.out.print("Input second number: ");
		int b = kb.nextInt();
		System.out.print(((a % 10 == b % 10) || (a % 10 == b / 10) || (a / 10 == b % 10) || (a / 10 == b / 10))?"True":"False");
	}

}
