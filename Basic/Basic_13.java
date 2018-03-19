import java.util.*;
public class Basic_13 {
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Width = ");
		float w = kb.nextFloat();
		System.out.print("Height = ");
		float h = kb.nextFloat();
		System.out.println("Area is " + w + "*" + h + " = " + (w*h));
		System.out.println("Perimeter is " + "2 * (" + w + " + " + h + ") = " + (2*h + 2*w));
	}
}