
import java.util.Scanner;

public class Conditional_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input number: ");
		int n = kb.nextInt();
		for (int i = 'A';i < 'A' + n ;i++)
		{
			for (int j = 1;j <= n - (i - 64);j++) System.out.print(" ");
			for (int j = 'A';j <= i;j++) System.out.print((char)j);
			for (int j = i-1;j >= 'A';j--) System.out.print((char)j);
			System.out.println();
		}
		for (int i = 'A' + n - 2 ;i >= 'A' ;i--)
		{
			for (int j = 1;j <= n - (i - 64);j++) System.out.print(" ");
			for (int j = 'A';j <= i;j++) System.out.print((char)j);
			for (int j = i-1;j >= 'A';j--) System.out.print((char)j);
			System.out.println();
		}
	}
}
