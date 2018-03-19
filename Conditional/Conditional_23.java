import java.util.Scanner;

public class Conditional_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input number: ");
		int n = kb.nextInt();
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j < i;j++) System.out.print(" ");
			for (int j = 1;j <= n-i+1;j++) System.out.print("*");
			System.out.println();
		}
		
	}
}
