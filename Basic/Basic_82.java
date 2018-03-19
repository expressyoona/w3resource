import java.util.Arrays;
import java.util.Scanner;

public class Basic_82 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Input the length of the array: ");
		int n = kb.nextInt();
		int A[] = new int[n];
		for (int i = 0;i < n;i++) 
			{
				A[i] = kb.nextInt();
			}
		int max = A[0];
		if (max < A[A.length/2]) max = A[A.length/2];
		if (max < A[A.length-1]) max = A[A.length-1];
		
		System.out.println("Largest element between first, last, and middle values: "+max);
	}

}
