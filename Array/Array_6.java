import java.util.Arrays;
import java.util.Scanner;

public class Array_6 {

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
		System.out.print("Input an element of array: ");
		int k = kb.nextInt();
		for (int i = 0;i < n;i++)
			if (A[i] == k)
			{
				System.out.print("Index: "+i);
			}
		
	}
}
