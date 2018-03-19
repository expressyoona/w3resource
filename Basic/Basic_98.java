import java.util.Arrays;
import java.util.Scanner;

public class Basic_98 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the length of the array: ");
		int n = kb.nextInt();
		int A[] = new int[n+1];
		int index1 = 0, index2 = 0;
		for (int i = 0;i < n;i++) A[i] = kb.nextInt();
		A[n] = 0;
		boolean kt = true;
		int dem = 0;
		for (int i = 0;i < n;i++)
		{
			if (A[i] == 20)
				{
					dem++;
					if (A[i+1] == 20)
						{
							kt = false;
							break;
						}
				}
		}
		System.out.println(((dem == 3) && (kt))?"True":"False");
	}
}

