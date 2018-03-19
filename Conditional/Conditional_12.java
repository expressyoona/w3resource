import java.util.Scanner;
public class Conditional_12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input number: ");
		int n = kb.nextInt();
		System.out.println("The first "+n+" natural numbers are: ");
		int S = 0;
		for (int i = 0;i < n;i++)
			{
				System.out.println(i);
				S += i;
			}
		System.out.println("Sum of first "+n+" natural numbers is: "+S);
		System.out.println("The average is: "+(float)S/n);
	}
}


