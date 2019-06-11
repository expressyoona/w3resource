import java.util.*;
public class Array_36 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = {75, 1, 2, 4, 2, 9, 3};
		int target = 5;
		for (int i = 0;i < A.length - 2;i++)
			for (int j =i + 1;j < A.length - 1;j++)
				for (int k = j + 1;k < A.length;k++)
					if (A[i] + A[j] + A[k] == target) System.out.println(i + ", " + j + ", " + k);
	} 
}
