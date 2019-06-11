import java.util.*;
public class Array_42 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = {1, 0, 0, 1, 0, 0, 1,};
		int B[] = new int[A.length];
		System.out.println("Original array: "+Arrays.toString(A));
		int left = 0, right = A.length - 1;
		for (int i = 0;i < A.length;i++)
		{
			if (A[i] == 0) B[left++] = 0;
			else B[right--] = 1;
		}
		System.out.println("New array: " + Arrays.toString(B));
	}  
}
