import java.util.Arrays;
import java.util.Scanner;

public class Basic_93 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the length of the array: ");
		int n = kb.nextInt();
		int A[] = new int[n];
		for(int i = 0;i < n;i++)
			{
				A[i] = kb.nextInt();
			}
		boolean kt1 = false,kt2 = false;
		for(int i = 0;i < n - 1;i++)
		{
			if ((A[i] == 10) && (A[i+1] == 10)) kt1 = true;
			if ((A[i] == 20) && (A[i+1] == 20)) kt2 = true;
		}
		System.out.print((kt1 != kt2)?"True":"False");
	}
}
