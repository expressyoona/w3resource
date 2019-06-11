import java.util.*;
public class Method_13 {
	public static float CalArea(int a, int b, int c)
	{
		float p = (a + b + c)/2;
		return (float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input side - 1: ");
		int x = kb.nextInt();
		System.out.print("Input side - 2: ");
		int y = kb.nextInt();
		System.out.print("Input side - 3: ");
		int z = kb.nextInt();
		System.out.println("The area of the triangle is: "+CalArea(x, y, z));
	}  
}
