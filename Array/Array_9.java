import java.util.Arrays;
import java.util.Scanner;

public class Array_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the length of the array(n < 20): ");
		int n = kb.nextInt();
		int A[] = new int[20];
		for (int i = 0;i < n;i++)
		{
			System.out.print("A["+i+"] = ");
			A[i] = kb.nextInt();
		}
		System.out.print("Input index to insert: ");
		int k = kb.nextInt();
		System.out.print("Input value to insert: ");
		int vl = kb.nextInt();
		System.out.print("Original array: ");
		for (int i = 0;i < n;i++) System.out.print(A[i] + " ");
		n++;
		for (int i = n - 1;i > k;i--)
		{
			A[i] = A[i-1];
		}
		A[k] = vl;
		System.out.print("\nNew array: ");
		for (int i = 0;i < n;i++) System.out.print(A[i] + " ");
	}
}
