import java.util.Arrays;
import java.util.Scanner;

public class Array_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = {13, 13, 13, 5, 6, 6, 3, 12, 12,3};
		Arrays.sort(A);
		int Min = A[0];
		System.out.println(Arrays.toString(A));
		int i = 0;
		for (;i < A.length;i++)
			if (A[i] > Min)
			{
				System.out.println(A[i]);
				break;
			}
		
	}
}
