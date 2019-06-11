import java.util.*;
public class Method_9 {
	public static void printCharacter(char a, char b)
	{
		int ctr = 0;
		for (int i = a;i <= b;i++)
		{
			ctr++;
			System.out.print((char)i + "\t");
			if (ctr % 20 == 0) System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		printCharacter('A', 'z');
	}  
}
