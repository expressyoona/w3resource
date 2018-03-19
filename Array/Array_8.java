import java.util.Arrays;
import java.util.Scanner;

public class Array_8 {

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
		int B[] = Arrays.copyOf(A, n);
		System.out.println("Source array: "+Arrays.toString(A));
		System.out.println("New array: "+Arrays.toString(B));
		
	}
}
