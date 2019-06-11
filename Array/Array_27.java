import java.util.*;
public class Array_27 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = {6, 0, 4, 5, 5, 0, 1};
		int ctr = 0;
		for (int i = 0;i < A.length;i++)
			if (A[i] % 2 == 0) ctr++;
		System.out.println("Number of even number: "+ctr);
		System.out.println("Number of odd number: "+(A.length-ctr));
	} 
}
