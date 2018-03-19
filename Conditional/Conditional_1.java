import java.util.Arrays;
import java.util.Scanner;

public class Conditional_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int n = kb.nextInt();
		System.out.println((n >= 0)?"Number is positive":"Number is Negative");
	}
}


