import java.util.Arrays;
import java.util.Scanner;

public class Basic_108 {
	public static int SoD(int n)
	{
		int S = 0;
		while (n != 0)
		{
			S += n % 10;
			n /= 10;
		}
		return S;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = kb.nextInt();
		do
		{
			n = SoD(n);
		}
		while (n > 9);
		System.out.println(n);
	}
}


