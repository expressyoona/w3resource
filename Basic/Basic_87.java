import java.util.Arrays;
import java.util.Scanner;

public class Basic_87 {	
	public static String say(char n)
	{
		switch(n)
		{
		case '1': return "One";
		case '2': return "Two";
		case '3': return "Three";
		case '4': return "Four";
		case '5': return "Five";
		case '6': return "Six";
		case '7': return "Seven";
		case '8': return "Eight";
		case '9': return "Nine";
		case '0': return "Zero";
		}
		return "";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = kb.nextInt();
		int S = 0;
		while (n != 0)
		{
			S += n % 10;
			n /= 10;
		}
		String number = String.valueOf(S);
		for (int i = 0;i < number.length();i++)
			System.out.print(say(number.charAt(i)) + " ");
	}
}
