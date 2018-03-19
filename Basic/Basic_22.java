import java.util.Scanner;

public class Basic_22 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a binary number: ");
		int n = kb.nextInt();
		int t = 0,dem = 0;
	    while (n != 0)
	    {
	      if (n % 10 == 1) t += Math.pow(2,dem);
	      dem++;
	      //t *= 10;
	      n /= 10;
	    }
		System.out.println("Decimal number is "+t);
	}

}
