import java.util.*;
public class Number_1 {
	public static boolean isUglyNumber(int n)
	{
		int i = 2;
		while (n != 1)
		{
			if (n % i == 0)
				{
					n /= i;
				}
			else i++;
		}
		if (i > 5) return false;
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = kb.nextInt();
		System.out.println(isUglyNumber(n)?"It is an ugly number":"It isn't an ugly number");
	}  
}
