import java.util.Arrays;
import java.util.Scanner;

public class Basic_104 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the length of the array: ");
		int n = kb.nextInt();
		int A[] = new int[n],index = 0;
		boolean check = false;
		for (int i = 0;i < n;i++) 
			{
				A[i] = kb.nextInt();
				if ((A[i] == 10) && (!check)) index = i;
			}
		int B[] = Arrays.copyOf(A, index);
		System.out.println(Arrays.toString(B));
	}
}


