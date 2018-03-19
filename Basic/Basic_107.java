import java.util.Arrays;
import java.util.Scanner;

public class Basic_107 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the length of the array: ");
		int n = kb.nextInt();
		int A[] = new int[n],index = 0;
		for (int i = 0;i < n;i++) 
			{
				A[i] = kb.nextInt();
			}
		System.out.println("Original array: "+Arrays.toString(A));
		boolean kt = false;
		for (int i = 0;i < n-3;i++)
		{
			if (A[i] + 1 == A[i+1])
				if (A[i+1] + 1 == A[i+2]) kt = true;
		}
		System.out.print(kt?"True":"False");
	}
}


