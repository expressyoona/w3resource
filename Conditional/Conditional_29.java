import java.util.Scanner;
public class Conditional_29 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int n = kb.nextInt();
		int count = 0;
		while (n != 0)
		{
			count++;
			n /= 10;
		}
		System.out.print("The number of digits is: "+count);
	}
}


