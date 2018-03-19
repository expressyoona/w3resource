import java.util.Arrays;
import java.util.Scanner;

public class Basic_109 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = kb.nextInt();
		int i = 1,dem=0;
		while (n > 0)
		{
			if (n - i >= 0)
				{
					n -= i;
					dem++;
				}
			else break;
			i++;
		}
		System.out.println(dem);
	}
}


