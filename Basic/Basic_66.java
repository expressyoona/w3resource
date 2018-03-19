import java.util.Scanner;

public class Basic_66 {
	public static boolean isPrimeNumber(int n)
	{
		if (n < 2) return false;
		for (int i = 2;i < Math.sqrt(n);i++)
			if (n % i == 0) return false;
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int dem = 0,i = 1;
		long S = 0;
		while (dem != 100)
		{
			i++;
			if (isPrimeNumber(i))
				{
					S += i;
					dem++;
				}			
		}
		System.out.print("Sum of first 100 prime number is: "+S);
	}

}
