import java.util.Arrays;
import java.util.Scanner;

public class Array_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the number of column: ");
		int m = kb.nextInt();
		System.out.print("Input the number of row: ");
		int n = kb.nextInt();
		int A[][] = new int[m][n];
		int B[][] = new int[m][n];
		System.out.println("First matrix: ");
		for (int i = 0;i < m;i++)
		{
			for (int j = 0;j < n;j++) A[i][j] = kb.nextInt();
		}
		System.out.println("Second matrix: ");
		for (int i = 0;i < m;i++)
		{
			for (int j = 0;j < n;j++) B[i][j] = kb.nextInt();
		}
		System.out.println("Result: ");
		for (int i = 0;i < m;i++)
		{
			for (int j = 0;j < n;j++) System.out.print(A[i][j] + B[i][j] + " ");
			System.out.println();
		}
	}
}
