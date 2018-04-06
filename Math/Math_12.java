import java.text.DecimalFormat;
import java.util.*;
public class Math_12 {
	public static boolean isPrimeNumber(int n)
	{
		if (n < 2) return false;
		for(int i = 2;i <= Math.sqrt(n);i++)
			if (n % i == 0) return false;
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = kb.nextInt();
		int ctr = 0;
		for (int i = 2;i < n;i++)
			if (isPrimeNumber(i)) ctr++;
		System.out.println("Number of prime number less than "+n+" is: "+ctr);
	}
}
