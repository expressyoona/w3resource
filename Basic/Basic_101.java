import java.util.Arrays;
import java.util.Scanner;

public class Basic_101 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the length of the array: ");
		int n = kb.nextInt();
		int A[] = new int[n+1];
		for (int i = 0;i < n;i++) A[i] = kb.nextInt();
		int count1 = 0,count2 = 0;
		for (int i = 0;i < n;i++)
		{
			if (A[i] == 10) count1++;
			if (A[i] == 20) count2++;
		}
		System.out.println((count1 > count2)?"True":"False");
	}
}


