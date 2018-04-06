import java.util.Arrays;
import java.util.Scanner;

public class Array_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the length of the array(n < 20): ");
		int n = kb.nextInt();
		kb.nextLine();
		String A[] = new String[n];
		for (int i = 0;i < n;i++)
			A[i] = kb.nextLine();
		String B[] = new String[10];
		int j = -1;
		for (int i = 0;i < n;i++)
		{
			boolean check = true;
			for (int k = 0;k < B.length;k++)
				if (A[i].equals(B[k]))
				{
					check = false;
					break;
				}
			if (check)
			{
				j++;
				B[j] = A[i];
			}
		}/*
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));*/
		for (int i = 0;i < j;i++)
		{
			int dem = 0;
			for (int k = 0;k < n;k++)
				if (B[i].equals(A[k])) dem++;
			if (dem == 2) System.out.println("Duplicate value: "+B[i]);
		}
	}
}
