import java.util.Scanner;
public class Conditional_10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input number: ");
		int n = kb.nextInt();
		System.out.println("The first "+n+" natural numbers are: ");
		for (int i = 0;i < n;i++)
			System.out.println(i);
	}
}


