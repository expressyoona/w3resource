import java.util.*;
public class Basic_12 {
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter first number: ");
		float a = kb.nextFloat();
		System.out.print("Enter second number: ");
		float b = kb.nextFloat();
		System.out.print("Enter third number: ");
		float c = kb.nextFloat();
		System.out.print("Average = ",(a+b+c)/3);
	}
}