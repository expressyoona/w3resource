import java.util.*;
public class Array_50 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = {3, 2, 5, 4, 1};
		int B[] = new int[A.length];
		int left = 0,right = A.length - 1;
		System.out.println("Original array: " + Arrays.toString(A));
		Arrays.sort(A);
		for (int i = 0;i < B.length;i++)
		{
			if (i % 2 == 0) B[i] = A[right--];
			else B[i] = A[left++];
		}
		System.out.print("New array: " + Arrays.toString(B));
	}  
}
