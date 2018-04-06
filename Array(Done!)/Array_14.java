import java.util.Arrays;
import java.util.Scanner;

public class Array_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the length of the first array: ");
		int n = kb.nextInt();
		String A[] = new String[n];
		kb.nextLine();
		for (int i = 0;i < n;i++) A[i] = kb.nextLine();
		System.out.print("Input the length of the second array: ");
		int m = kb.nextInt();
		String B[] = new String[m];
		kb.nextLine();
		for (int i = 0;i < m;i++) B[i] = kb.nextLine();
		String C[] = new String[10];
		int j = -1;
		for (int i = 0;i < n;i++)
		{
			for (int k = 0;k < m;k++)
			{
				if (A[i].equals(B[k]))
						{
							boolean check = true;
							for (int l = 0;l < C.length;l++)
								if (A[i].equals(C[l]))
								{
									check = false;
									break;
								}
							if (check)
							{
								j++;
								C[j] = A[i];
							}
						}
			}
		}
		System.out.println("Common value: ");
		for (int i = 0;i <= j;i++) System.out.print(C[i] + ", ");
	}
}
