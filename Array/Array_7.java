import java.util.Arrays;
import java.util.Scanner;

public class Array_7 {

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
		System.out.print("Input index of element to remove: ");
		int k = kb.nextInt();
		System.out.println("Original array: "+Arrays.toString(A));
		for (int i = k;i < n-1;i++)
		{
			A[i] = A[i+1];
		}
		n--;
		System.out.print("After removing the "+(k+1)+" element: ");
		for (int i = 0;i < n;i++) System.out.print(A[i] + " ");
		
	}
}
