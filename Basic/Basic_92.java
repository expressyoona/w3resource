import java.util.Arrays;
import java.util.Scanner;

public class Basic_92 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the length of the array: ");
		int n = kb.nextInt();
		int A[] = new int[n];
		int odd = 0;
		for(int i = 0;i < n;i++)
			{
				A[i] = kb.nextInt();
				if (A[i] % 2 != 0) odd++;
			}
		System.out.println("Number of odd element is: "+odd);
		System.out.println("Number of even element is: "+(n-odd));
	}
}
