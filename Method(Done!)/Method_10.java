import java.util.*;
public class Method_10 {
	public static boolean isLeapYear(int n)
	{
		return (((n % 4 == 0) && (n % 100 != 0)) || (n % 400 == 0));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a year: ");
		int n = kb.nextInt();
		System.out.println(isLeapYear(n));
	}  
}
