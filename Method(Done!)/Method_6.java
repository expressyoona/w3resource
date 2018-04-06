import java.util.*;
public class Method_6 {
	public static int SumOfDigits(int n)
	{
		if (n < 10) return n;
		else return n % 10 + SumOfDigits(n/10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = kb.nextInt();
		System.out.println("Number of digits: "+SumOfDigits(n));
	}  
}
