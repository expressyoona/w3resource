import java.util.*;
public class Number_2 {
	public static int SumOfFactor(int n)
	{
		int S = 0;
		for (int i = 1;i <  Math.sqrt(n);i++)
			if (n % i == 0) S += i + n/i;
		return S - n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int Abundant = 0, Perfect = 0, Deficient = 0;
		System.out.println(SumOfFactor(1));
		for (int i = 1;i <= 10000;i++)
		{
			if (SumOfFactor(i) > i) Abundant++;
			else if (SumOfFactor(i) < i) Deficient++;
			else
				{
					System.out.println(i);
					Perfect++;
				}
		}
		System.out.println("Abundant number: "+Abundant);
		System.out.println("Perfect number: "+Perfect);
		System.out.println("Deficient number: "+Deficient);
	}  
}
