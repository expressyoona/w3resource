import java.util.Arrays;
import java.util.Scanner;

public class Basic_115 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = kb.nextInt();
		int t = 0,x=n;
		while (n != 0)
		{
			t = t * 10 + n % 10;
			n /= 10;
		}
		System.out.println((t == x)?"True":"False");
	}
}


