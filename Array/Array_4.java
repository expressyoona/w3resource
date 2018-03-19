import java.util.Arrays;
import java.util.Scanner;

public class Array_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the length of the array: ");
		int n = kb.nextInt();
		int A[] = new int[n],S = 0;
		for (int i = 0;i < n;i++)
		{
			System.out.print("A["+i+"] = ");
			A[i] = kb.nextInt();
			S += A[i];
		}
		System.out.println("Average: "+(float)S/n);
		
	}
}
