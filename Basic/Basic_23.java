import java.util.Scanner;

public class Basic_23 {
	public static int toDec(int n)
	  {
	    int t = 0,dem = 0;
	    while (n != 0)
	    {
	      if (n % 10 == 1) t += Math.pow(2,dem);
	      dem++;
	      //t *= 10;
	      n /= 10;
	    }
	    return t;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a binary number: ");
		int a = kb.nextInt();
		/*System.out.print("Enter second number: ");
		int b = kb.nextInt();*/
		System.out.println("Result: "+Integer.toHexString(toDec(a)));
	}

}
