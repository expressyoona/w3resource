import java.util.*;
public class Array_32 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = {10, 77, 2, 65,3};
		boolean check1 = false, check2 = false;
		for (int i = 0;i < A.length;i++)
		{
			if (A[i] == 65) check1 = true;
			if (A[i] == 77) check2 = true;
		}
		System.out.println((check1 && check2)?"Yes":"No");
	} 
}
