import java.util.Scanner;

public class Basic_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the length of a side of the hexagon: ");
		float r = kb.nextFloat();
		System.out.print("The area of the hexagon is: "+(6 * r * r)/(4*Math.tan(Math.PI/6)));
		
	}

}
