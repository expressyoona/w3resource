import java.util.Arrays;
import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the length of the array: ");
		int n = kb.nextInt();
		int A[] = new int[n];
		int S = 0;
		for (int i = 0;i < n;i++)
			{
				A[i] = kb.nextInt();
				S += A[i];
			}
		System.out.print("Sum of all element in array: "+S);
		
	}
}
