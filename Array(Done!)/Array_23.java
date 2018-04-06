import java.util.*;
public class Array_23 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = {2, 5, 7, 9};
		int B[] = {2, 5, 7, 9};
		boolean check = true;
		for (int i = 0;i < A.length;i++)
			if (A[i] != B[i])
			{
				check = false;
				break;
			}
		System.out.println(check?"Two arrays are equal":"Two arrays aren't equal");
	} 
}
