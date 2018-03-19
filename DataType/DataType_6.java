import java.util.*;
public class DataType_6
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Input weight in pounds: ");
		int w = kb.nextInt();
		System.out.print("Input height in inches: ");
		int h = kb.nextInt();
		System.out.print("BMI is: "+(float)w*703/(h*h));
	}
}