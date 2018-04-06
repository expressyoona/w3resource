import java.util.*;
public class Array_44 {
	public static boolean isTriangle(int a, int b, int c)
	{
		if ((a > 0) && (b > 0) && (c > 0) && (a + b > c) && (a + c > b) && (b + c > a)) return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int ctr = 0;
		int A[] = {3, 4, 5};
		for (int i = 0;i <= A.length - 2;i++) 
			for (int j = i + 1;j <= A.length - 1;j++)
				for (int k = j + 1;k < A.length;k++)
					{
						if (isTriangle(A[i],A[j],A[k])) ctr++;
					}
		System.out.println("Number of possible triangles from array: "+ctr);
	}  
}
