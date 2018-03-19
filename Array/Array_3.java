import java.util.Arrays;
import java.util.Scanner;

public class Array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int n = kb.nextInt();
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++) System.out.print("-");
			System.out.println();
		}
		
	}
}
