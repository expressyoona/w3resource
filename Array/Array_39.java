import java.util.*;
public class Array_39 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = {75, 1, 2, 4, 9, 7, 3};
		System.out.println("LEADERS: ");
		for (int i = A.length - 2;i >= 0;i--)
		{
			boolean check = true;
			for (int j = i + 1;j <= A.length - 1;j++)
				if (A[i] < A[j])
					{
						//System.out.println(A[j]);
						check = false;
					}
			if (check) System.out.println(A[i]);
		}
	} 
}
