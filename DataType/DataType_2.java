import java.util.*;
public class DataType_2
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a value for inch: ");
		float i = kb.nextFloat();
		System.out.print(i + " inch is " + (i*0.0254) + "meters");
	}
}