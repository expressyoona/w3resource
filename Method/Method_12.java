import java.util.*;
public class Method_12 {
	public static void printMatrix(int n)
	{
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++) System.out.print((int)(Math.random() * 2) + " ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = kb.nextInt();
		printMatrix(n);
	}  
}
