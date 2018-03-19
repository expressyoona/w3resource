import java.util.Arrays;
import java.util.Scanner;

public class Array_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the length of the numeric array: ");
		int n = kb.nextInt();
		int A[] = new int[n];
		for (int i = 0;i < n;i++) A[i] = kb.nextInt();
		System.out.print("Input the length of the string array: ");
		int m = kb.nextInt();
		String B[] = new String[m];
		for (int i = 0;i < m;i++) B[i] = kb.nextLine();
		System.out.println("Original numeric array: "+Arrays.toString(A));
		Arrays.sort(A);
		System.out.println("The numeric array are sorted: "+Arrays.toString(A));
		System.out.println("Original string array: "+Arrays.toString(B));
		Arrays.sort(B);
		System.out.println("The string array are sorted: "+Arrays.toString(B));
	}
}
