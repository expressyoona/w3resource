import java.util.Scanner;

public class Conditional_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input number: ");
		int n = kb.nextInt();
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n - i;j++) System.out.print(" ");
			for (int j = i;j >= 1;j--) System.out.print(j);
			for (int j = 2;j <= i;j++) System.out.print(j);
			System.out.println();
		}
		for (int i = n-1;i >= 1;i--)
		{
			for (int j = 1;j <= n - i;j++) System.out.print(" ");
			for (int j = i;j >= 1;j--) System.out.print(j);
			for (int j = 2;j <= i;j++) System.out.print(j);
			System.out.println();
		}
		
	}
}
