import java.util.Scanner;
public class Conditional_31 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input 1st number: ");
		int a = kb.nextInt();
		System.out.println("Input 2nd number: ");
		int b = kb.nextInt();
		System.out.print("Input 3rd number: ");
		int c = kb.nextInt();
		System.out.println(((a < b) && (b < c))?"Increasing":((a > b) && (b > c))?"Decreasing":"Neither increasing or decreasing order");
	}
}


