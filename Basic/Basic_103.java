import java.util.Arrays;
import java.util.Scanner;

public class Basic_103 {	
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
		int B[] = new int[A.length-index-1],j = 0;
		for (int i = index+1;i < n;i++,j++) B[j] = A[i];
		System.out.println(Arrays.toString(B));
	}
}


