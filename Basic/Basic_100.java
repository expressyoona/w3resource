import java.util.Arrays;
import java.util.Scanner;

public class Basic_100 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the length of two array: ");
		int n = kb.nextInt();
		int A[] = new int[n],B[] = new int[n];
		for (int i = 0;i < n;i++) A[i] = kb.nextInt();
		for (int i = 0;i < n;i++) B[i] = kb.nextInt();
		int dem = 0;
		for (int i = 0;i < n;i++)
			if (Math.abs(A[i] - B[i]) == 1) dem++;
		System.out.println(dem);
	}
}


