import java.util.*;
public class Array_40 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = {1, 2, 4, 9, 7, 3};
		int B[] = {-12, -8, -5, -6};
		int Min = Integer.MAX_VALUE;
		int vl1 = 0,vl2 = 0;
		for (int i = 0;i < A.length;i++)
		{
			for (int j = 0;j < B.length;j++)
				if (Math.abs(A[i] + B[j]) < Min)
				{
					Min = Math.abs(A[i] + B[j]);
					vl1 = A[i];
					vl2 = B[j];
				}
		}
		System.out.println(vl1 + " and " + vl2);
		
	} 
}
