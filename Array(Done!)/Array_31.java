import java.util.*;
public class Array_31 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = {10, 10, 2, 10,3};
		int S = 0;
		for (int i = 0;i < A.length;i++)
			if (A[i] == 10) S+= A[i];
		System.out.println((S==30)?"Yes":"No");
	} 
}
