import java.util.Scanner;
public class Conditional_19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input number of rows: ");
		int n = kb.nextInt();
		int dem = 1;
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1; j <= n - i;j++) System.out.print(" ");
			for (int j = 1; j <= i;j++) System.out.print(i + " ");
			System.out.println();
		}
	}
}


