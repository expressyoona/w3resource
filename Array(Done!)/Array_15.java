import java.util.Arrays;
import java.util.Scanner;

public class Array_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = {5, 6, 8};
		int B[] = {1, 6, 5, 3, 8};
		boolean[] check = new boolean[10];
		for (int i = 0;i < check.length;i++) check[i] = true;
		for (int i = 0;i < A.length;i++)
		{
			for (int j = 0;j < B.length;j++)
				if ((A[i] == B[j]) && (check[A[i]]))
					{
						System.out.print(A[i] + ", ");
						check[A[i]] = false;
					}
		}
	}
}
