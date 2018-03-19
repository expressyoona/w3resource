import java.util.Arrays;
import java.util.Scanner;

public class Basic_83 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Input the length of the two array: ");
		int n = kb.nextInt();
		int A[] = new int[n],B[] = new int[n];
		for (int i = 0;i < n;i++) 
			{
				A[i] = kb.nextInt();
			}
		for (int i = 0;i < n;i++) 
		{
			B[i] = kb.nextInt();
		}
		for (int i = 0;i < n;i++)
			System.out.print((A[i] * B[i]) + " ");
	}

}
