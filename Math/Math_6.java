import java.text.DecimalFormat;
import java.util.*;
public class Math_6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = kb.nextInt();
		int dg = 0;
		while (n != 0)
		{
			dg = dg * 10 + (n % 10);
			n /= 10;
		}
		System.out.println("Reverse: "+dg);
	}
}
