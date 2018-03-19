import java.util.Scanner;

public class Basic_20 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = kb.nextInt();
		System.out.println("Hexadecimal number is: "+Integer.toHexString(a));
	}

}
