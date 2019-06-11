import java.util.Arrays;
import java.util.Scanner;

public class Array_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the length of the array(n < 20): ");
		int n = kb.nextInt();
		int A[] = new int[n];
		int B[] = new int[10];
		for (int i = 0;i < n;i++)
		{
			System.out.print("A["+i+"] = ");
			A[i] = kb.nextInt();
		}
		Arrays.sort(A);
		int j = -1;
		for (int i = 0;i < n - 1;i++)
		{
			boolean check = true;
			for (int k = 0;k < B.length;k++)
				if (B[k] == A[i]) check = false;
			if (check)
			{
				j++;
				B[j] = A[i];
			}
		}
		System.out.println("Original Array: "+Arrays.toString(A));
		Arrays.sort(B);
		System.out.println("New Array: "+Arrays.toString(B));
		for (int k = 0;k < B.length;k++)
		{
			int dem = 0;
			for (int i = 0; i < n;i++)
				if (A[i] == B[k]) dem++;
			if (dem == 2) System.out.println("Duplicate value: "+B[k]);
		}
	}
}
