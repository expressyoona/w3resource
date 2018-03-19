import java.util.Scanner;

public class Basic_30 {
	public static int value(char t)
	{
		switch(t)
		{
		case '1': return 1;
		case '2': return 2;
		case '3': return 3;
		case '4': return 4;
		case '5': return 5;
		case '6': return 6;
		case '7': return 7;
		case '8': return 8;
		case '9': return 9;
		case 'A': return 10;
		case 'B': return 11;
		case 'C': return 12;
		case 'D': return 13;
		case 'E': return 14;
		case 'F': return 15;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a Hexadecimal number: ");
		String n = kb.nextLine();
		int t = 0,dem = 0;
		for (int i = n.length() -1; i >= 0;i--)
			{
				t += value(n.charAt(i)) * (int)Math.pow(16, dem);
				dem++;
			}
		System.out.println("Octal number is: "+Integer.toOctalString(t));
	}

}
