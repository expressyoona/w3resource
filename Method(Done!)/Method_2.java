import java.util.*;
public class Method_2 {
	public static float Aver(int a, int b, int c)
	{
		return (a+b+c)/3.0f;
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
		System.out.println("The average value is: "+Aver(a,b,c));
	}  
}
