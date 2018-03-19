import java.util.Scanner;
public class Conditional_7 {
	public static String Month(int n)
	{
		switch(n)
		{
		case 1: return "January";
		case 2: return "February";
		case 3: return "March";
		case 4: return "April";
		case 5: return "May";
		case 6: return "June";
		case 7: return "July";
		case 8: return "August";
		case 9: return "September";
		case 10: return "October";
		case 11: return "November";
		case 12: return "December";
		}
		return "";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a month number: ");
		int m = kb.nextInt();
		System.out.print("Input a year: ");
		int y = kb.nextInt();
		switch(m)
		{
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: System.out.println(Month(m)+" "+y+" has 31 days");
		break;
		case 4: case 6: case 9: case 11: System.out.println(Month(m)+" "+y+" has 30 days");
		break;
		case 2:
			if (y % 4 == 0 && y % 100 != 0 || (y % 400 == 0)) System.out.println(Month(m)+" "+y+" has 29 days");
			else System.out.println(Month(m)+" "+y+" has 28 days");
		}
	}
}


