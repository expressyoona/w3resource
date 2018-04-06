import java.util.*;
public class Array_29 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = {1, 1, 2, 2,3};
		Arrays.sort(A);
		int Max = A[A.length - 1];
		int Min = A[0];
		int num = 0;
		int S = 0;
		for (int i = 1;i < A.length - 1;i++)
			if ((A[i] != Max) && (A[i] != Min))
			{
				S += A[i];
				num++;
			}
		System.out.println("Average of elements except the largest and smallest value: "+(float)S/num);
	} 
}
