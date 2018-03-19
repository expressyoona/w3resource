import java.util.*;
public class DataType_3
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Input an integer between 0 and 1000: ");
		int n= kb.nextInt();
		int S = 0,t = n;
		while (t != 0)
		{
			S += t % 10;
			t /= 10;
		}
		System.out.print("The sum of all digits in "+n+" is "+S);
	}
}