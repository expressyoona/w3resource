import java.util.Arrays;
import java.util.Scanner;

public class Basic_106 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the length of the array: ");
		int n = kb.nextInt();
		int A[] = new int[n],index = 0;
		for (int i = 0;i < n;i++) 
			{
				A[i] = kb.nextInt();
			}
		System.out.println("Original array: "+Arrays.toString(A));
		int t = A[0];
		for (int i = 0;i < n-1;i++) A[i] = A[i+1];
		A[n-1] = t;
		System.out.println("New array: " + Arrays.toString(A));
	}
}


