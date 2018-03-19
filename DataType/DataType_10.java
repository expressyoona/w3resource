import java.util.Arrays;
import java.util.Scanner;

public class DataType_10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int n = kb.nextInt();
		int A[] = new int[10],i=0;
		while (n != 0)
		{
			A[i] = n % 10;
			n /= 10;
			i++;
		}
		for (int k = i-1;k >= 0;k--) System.out.print(A[k] + " ");
	}
}


