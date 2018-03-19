import java.util.Scanner;

public class Basic_76 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = new int[10],B[] = new int[10];
		System.out.print("Input the length of the first array: ");
		int n = kb.nextInt();
		for (int i = 0;i < n;i++) A[i] = kb.nextInt();
		System.out.print("Input the length of the second array: ");
		int m = kb.nextInt();
		for (int i = 0;i < m;i++) B[i] = kb.nextInt();
		System.out.print(((A[0] == B[m-1]) || (B[0] == A[n-1]))?"True":"False");
	}

}
