import java.util.Scanner;
public class Conditional_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int m = kb.nextInt();
		int n = (m > 0)?1:(m == 0)?0:-1;
		System.out.println("The value of m = "+m);
		System.out.println("The value of n = "+n);
	}
}


