import java.util.*;
public class Method_1 {
	public static int Min(int a, int b, int c)
	{
		return Math.min(Math.min(a, b), c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the first number: ");
		int a = kb.nextInt();
		System.out.print("Input the second number: ");
		int b = kb.nextInt();
		System.out.print("Input the third number: ");
		int c = kb.nextInt();
		System.out.println("The smallest value is: "+Min(a,b,c));
	}  
}
