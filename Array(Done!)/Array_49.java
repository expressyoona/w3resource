import java.util.*;
public class Array_49 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = {2, -3 , -5, 5, -4, 5, 6};
		int B[] = new int[A.length];
		int left = 0,right = A.length - 1;
		for (int i = 0;i < A.length;i++)
		{
			if (A[i] <= 0) B[right--] = A[i];
			else B[left++] = A[i];
		}
		System.out.println("Original array: " + Arrays.toString(A));
		System.out.println("New array: " + Arrays.toString(B));
	}  
}
