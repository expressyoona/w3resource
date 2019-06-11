import java.util.*;
public class Method_14 {
	public static float CalArea(int n, int s)
	{
		return (float) ((float)(n * s * s)/(4 * Math.tan(Math.PI/n)));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the number of side: ");
		int n = kb.nextInt();
		System.out.print("Input the side: ");
		int s = kb.nextInt();
		System.out.print("The area of the pentagon is: "+CalArea(n, s));
	}  
}
