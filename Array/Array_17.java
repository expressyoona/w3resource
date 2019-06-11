import java.util.Arrays;
import java.util.Scanner;

public class Array_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = {13, 13, 13, 5, 6, 6, 3, 12, 12};
		Arrays.sort(A);
		int Max = A[A.length - 1];
		System.out.println(Arrays.toString(A));
		int i = A.length - 1;
		for (;i >= 0;i--)
			if (A[i] < Max)
			{
				System.out.println(A[i]);
				break;
			}
		
	}
}
