import java.util.*;
public class Basic_11 {
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Radio = ");
		float r = kb.nextFloat();
		System.out.println("Perimeter is = ",r * 2 * Math.PI);
		System.out.println("Area is = ",r * r * Math.PI);
	}
}