import java.util.*;
public class Array_24 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = {1, 2, 3, 4, 6, 7};
		for (int i = 0;i < A.length-1;i++)
		{
			if (A[i+1] - A[i] != 1)
			{
				for (int k = A[i] + 1;k < A[i+1];k++) System.out.print(k + " ");
			}
		}
	} 
}
