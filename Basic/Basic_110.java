import java.util.Arrays;
import java.util.Scanner;

public class Basic_110 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = kb.nextInt();
		boolean kt = true;
		while (n != 1)
		{
			if (n % 4 == 0) n /= 4;
			else
			{
				kt = false;
				break;
			}
		}
		System.out.println(kt?"True":"False");
	}
}


