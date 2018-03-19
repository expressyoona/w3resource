import java.util.Scanner;

public class Basic_75 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the length of the array: ");
		int n = kb.nextInt();
		int A[] = new int[10];
		for (int i = 0;i < n;i++) A[i] = kb.nextInt();
		System.out.print((A[0] == A[n-1])?"True":"False");
	}

}
