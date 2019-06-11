import java.util.*;
public class Array_28 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = {6, 0, 4, 5, 5, 0, 1};
		Arrays.sort(A);
		System.out.println("The different between smallest and largest value in array: "+(A[A.length-1] - A[0]));
	} 
}
