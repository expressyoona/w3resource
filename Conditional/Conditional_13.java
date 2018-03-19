import java.util.Scanner;
public class Conditional_13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input number: ");
		int n = kb.nextInt();
		for (int i = 1;i <= n;i++)
			System.out.println("Number is: "+i+" and cube of "+i+" is "+i*i*i);
	}
}


