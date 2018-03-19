import java.util.Arrays;
import java.util.Scanner;

public class Basic_96 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the length of the array: ");
		int n = kb.nextInt();
		int A[] = new int[n];
		int index1 = 0, index2 = 0;
		for (int i = 0;i < n;i++) A[i] = kb.nextInt();
		for (int i = 0;i < n;i++)
		{
			if (A[i] == 10) index1 = i;
			if (A[i] == 20)
				{
					index2 = i;
					break;
				}
		}
		System.out.print((index1 < index2)?"True":"False");
	}
}
