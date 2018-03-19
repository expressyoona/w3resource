import java.util.Scanner;

public class Basic_19 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = kb.nextInt();
		System.out.println("Binary number is: "+Integer.toBinaryString(a));
	}

}
