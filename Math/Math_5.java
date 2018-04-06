import java.text.DecimalFormat;
import java.util.*;
public class Math_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = {4, 5, -4, -5, 5, 2, 1};
		boolean check[] = new boolean[10];
		int ctr = 0;
		for (int i = 0;i < A.length;i++)
		{
			if (!check[Math.abs(A[i])])
			{
				check[A[i]] = true;
				ctr++;
			}
		}
		System.out.println(ctr);
	}
}
