import java.util.Arrays;
import java.util.Scanner;

public class Basic_95 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the length of the array: ");
		int n = kb.nextInt();
		String A[] = new String[n];
		for (int i = 0;i < n;i++) A[i] = String.valueOf(i);
		System.out.println("Array: "+Arrays.toString(A));
	}
}
