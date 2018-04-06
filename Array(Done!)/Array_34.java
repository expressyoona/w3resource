import java.util.*;
public class Array_34 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = {75, 1, 2, 4, 2, 9, 3};
		Arrays.sort(A);
		int Max = 1;
		int dem = 1;
		for (int i = 0;i < A.length - 1;i++)
		{
			
			if (A[i+1] == A[i] + 1) dem++;
			else
			{
				if (dem > Max) Max = dem;
				dem = 1;
			}
		}
		System.out.println(Max);
	} 
}
