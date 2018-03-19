import java.util.Scanner;
public class Conditional_27 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input an integer: ");
		float n = kb.nextFloat();
		System.out.println((n == 0)?"Zero":(n > 0)?"Positive":"Negative");
	}
}


