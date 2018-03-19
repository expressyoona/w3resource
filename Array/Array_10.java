import java.util.Arrays;
import java.util.Scanner;

public class Array_10 {

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
		int Max = A[0], Min = A[0];
		for (int i = 0;i < n;i++)
		{
			Max = (A[i] > Max)?A[i]:Max;
			Min = (A[i] < Min)?A[i]:Min;
		}
		System.out.println("Max = "+Max);
		System.out.println("Min = "+Min);
	}
}
