import java.util.Arrays;
import java.util.Scanner;

public class Array_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the length of the array: ");
		int n = kb.nextInt();
		int A[] = new int[n];
		for (int i = 0;i < n;i++)
		{
			System.out.print("A["+i+"] = ");
			A[i] = kb.nextInt();
		}
		System.out.print("Input specific value: ");
		int k = kb.nextInt();
		boolean kt = false;
		for (int i = 0;i < n;i++)
			if (A[i] == k)
			{
				kt = true;
				break;
			}
		System.out.print(kt?"Yes":"No");
		
	}
}
