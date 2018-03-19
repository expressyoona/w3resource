import java.util.Arrays;
import java.util.Scanner;

public class Basic_102 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the length of the array: ");
		int n = kb.nextInt();
		int A[] = new int[n];
		boolean kt = false;
		for (int i = 0;i < n;i++) 
			{
				A[i] = kb.nextInt();
				if ((A[i] == 10) || (A[i] == 30))
				{
					kt = false;
					break;
				}
			}
		System.out.println(kt?"True":"False");
	}
}


