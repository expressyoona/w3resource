import java.util.*;
public class Array_30 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = {1, 1, 2, 2,3};
		Arrays.sort(A);
		boolean check = true;
		for (int i = 0;i < A.length;i++)
			if ((A[i] == 0) || (A[i] == -1))
			{
				check = false;
				break;
			}
		System.out.println(check?"Yes":"No");
	} 
}
