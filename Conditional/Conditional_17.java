import java.util.Scanner;
public class Conditional_17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input number of rows: ");
		int n = kb.nextInt();
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= i;j++) System.out.print(i);
			System.out.println();
		}
	}
}


