import java.util.*;
public class Math_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a number: ");
		double t = kb.nextDouble();
		System.out.println((t - Math.floor(t) == 0)?"Integer number":"Not integer number");
	}
}
