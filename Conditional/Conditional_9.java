import java.util.Scanner;
public class Conditional_9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a year: ");
		int y = kb.nextInt();
		if ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0))
		{
			System.out.println(y+" is a leap year");
		}
		else
		{
			System.out.println(y+" isn't a leap year");
		}
	}
}


