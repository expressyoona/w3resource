import java.util.*;
public class Array_22 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = {2, 5, 7, 3, 6, 1, 9};
		int num = 7;
		for (int i = 0; i < A.length - 1;i++)
			for (int j = i + 1;j < A.length;j++)
				if (A[i] + A[j] == num) System.out.println(A[i] + " + " + A[j] + " = " + num);
	}
}
