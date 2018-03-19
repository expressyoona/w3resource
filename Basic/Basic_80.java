import java.util.Arrays;
import java.util.Scanner;

public class Basic_80 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = new int[10];
		System.out.print("Input the length of the array: ");
		int n = kb.nextInt();
		for (int i = 0;i < n;i++) A[i] = kb.nextInt();
		System.out.println("The large value beetween first and last element is: "+(A[0] > A[n-1])?A[0]:A[n-1]);
	}

}
