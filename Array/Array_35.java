import java.util.*;
public class Array_35 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = {75, 1, 2, 4, 2, 9, 3};
		int target = 5;
		for (int i = 0;i < A.length - 1;i++)
			for (int j =i + 1;j < A.length;j++)
				if (A[i] + A[j] == target) System.out.println("Index 1: " + i + ", index 2: " + j);
	} 
}
