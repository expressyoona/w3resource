import java.util.*;
public class Array_51 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = {3, 2, 5, 4, 1};
		int B[] = new int[A.length];
		int left = 0,right = A.length - 1;
		System.out.println("Original array: " + Arrays.toString(A));
		for (int i = 0;i < B.length;i++)
		{
			if (A[i] % 2 == 0) B[left++] = A[i];
			else B[right--] = A[i];
		}
		System.out.print("New array: " + Arrays.toString(B));
	}  
}
