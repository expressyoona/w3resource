import java.util.Scanner;
public class DataType_8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int n = kb.nextInt();
		System.out.println("Square = "+n*n);
		System.out.println("Cube = "+n*n*n);
		System.out.println("Fourth power = "+Math.pow(n, 4));
	}
}


