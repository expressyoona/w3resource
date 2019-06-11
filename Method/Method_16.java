import java.util.*;
public class Method_16 {
	public static boolean isPrimeNumber(int n)
	{
		if (n < 2) return false;
		for (int i = 2;i <= Math.sqrt(n);i++)
			if (n % i == 0) return false;
		return true;
	}
	public static void TwinPrimeNumber()
	{
		int dem = 0;
		for (int i = 2;i < 100;i++)
		{
			if (isPrimeNumber(i))
			{
				dem++;
				if (dem % 2 != 0) System.out.print("("+i);
				else System.out.println(", "+i+")");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		TwinPrimeNumber();
	}  
}
