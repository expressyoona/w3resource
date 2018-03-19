import java.util.Arrays;
import java.util.Scanner;

public class DataType_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a degree in Fahrenheit: ");
		float fr = kb.nextFloat();
		System.out.print(fr + "degree Fahrenheit is equal to "+(fr - 32)/1.8+" Celcius");
	}
}


