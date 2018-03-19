import java.util.Arrays;
import java.util.Scanner;

public class Array_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the length of the array: ");
		int n = kb.nextInt();
		int A[] = new int[n];
		for (int i = 0;i < n;i++)
		{
			System.out.print("A["+i+"] = ");
			A[i] = kb.nextInt();
		}
		System.out.println("Original array: "+Arrays.toString(A));
		for (int i = 0;i < A.length/2;i++)
		{
			int t = A[i];
			A[i] = A[A.length - i - 1];
			A[A.length - i - 1] = t;
		}
		System.out.println("After reverse: "+Arrays.toString(A)); 
	}
}
