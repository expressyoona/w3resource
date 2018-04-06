import java.util.*;
public class Math_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a number: ");
		double t = kb.nextDouble();
		System.out.println("Integral part: "+Math.floor(t));
		System.out.println("Fractional part: "+(t-Math.floor(t)));
	}
}
