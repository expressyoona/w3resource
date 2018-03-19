import java.util.Arrays;
import java.util.Scanner;

public class Basic_116 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		for (int i = 3;i <= 100;i++)
		{
			if ((i % 3 == 0) && (i % 5 == 0)) System.out.println("Fizz Buzz");
			if ((i % 3 == 0)) System.out.println("Fizz");
			if (i % 5 == 0) System.out.println("Buzz");
		}
	}
}


