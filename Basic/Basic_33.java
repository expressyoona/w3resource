import java.util.Scanner;

public class Basic_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = kb.nextInt();
		int S = 0;
		while (n != 0)
		{
			S += n % 10;
			n /= 10;
		}
		System.out.print("Sum of the digits is: "+S);
}
