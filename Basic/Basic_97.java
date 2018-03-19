import java.util.Arrays;
import java.util.Scanner;

public class Basic_97 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the length of the array: ");
		int n = kb.nextInt();
		System.out.print("Input specified number: ");
		int sp_number = kb.nextInt();
		int A[] = new int[n];
		int index1 = 0, index2 = 0;
		for (int i = 0;i < n;i++) A[i] = kb.nextInt();
		boolean kt = false;
		for (int i = 0;i < n - 2;i++)
		{
			if (((A[i] == sp_number) && (A[i+1] == sp_number)) ||  ((A[i] == sp_number) && (A[i+2] == sp_number)))
				{
					kt = true;
					break;
				}
		}
		System.out.println(kt?"True":"False");
	}
}

