import java.util.Scanner;

public class Basic_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the number of side on the polygon: ");
		float n = kb.nextFloat();
		System.out.print("Input the length of one of the side: ");
		float s = kb.nextFloat();
		System.out.print("Area is: "+(n*s*s)/(4*Math.tan(Math.PI/n)));
		
	}

}
