import java.util.*;
public class Array_41 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = {1, 2, 1, 0, 4, 9, 7, 3};
		Arrays.sort(A);
		int Smallest = A[0];
		int SecSmallest = A[0];
		for (int i = 1;i < A.length;i++)
			if (A[i] > Smallest) 
				{
					SecSmallest = A[i];
					break;
				}
		System.out.println("Smallest value: " + Smallest);
		System.out.println("Second smallest value: " + SecSmallest);
	}  
}
