import java.util.*;
public class Array_26 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = {6, 0, 4, 5, 5, 0, 1};
		int B[] = new int[A.length];
		int k = -1;
		for (int i = 0;i < A.length;i++)
			if (A[i] != 0) B[++k] = A[i];
		System.out.println("Original array: "+Arrays.toString(A));
		System.out.println("New array: "+Arrays.toString(B));
	} 
}
