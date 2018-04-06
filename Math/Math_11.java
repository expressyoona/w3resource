import java.text.DecimalFormat;
import java.util.*;
public class Math_11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input first number: ");
		int a = kb.nextInt();
		System.out.print("Input second number: ");
		int b = kb.nextInt();
		System.out.println(((a == 15) || (b == 15) || (a + b == 15) || (a - b == 15))?"True":"False");
	}
}
