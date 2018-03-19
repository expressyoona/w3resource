import java.util.Arrays;
import java.util.Scanner;

public class DataType_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input distance in meters: ");
		int l = kb.nextInt();
		System.out.print("Input hour: ");
		int h = kb.nextInt();
		System.out.print("Input minutes: ");
		int m = kb.nextInt();
		System.out.print("Input seconds: ");
		int s = kb.nextInt();
		System.out.println("Your speed is in m/s: "+(float)l/(h*3600 + m*60+ s));
		System.out.println("Your speed is in km/h: "+3.6*l/(h*3600 + m*60+ s));
		System.out.println("Your speed is in miles/h is: "+(float)l*3600/(h*3600 + m*60+ s)/1690);
	}
}


