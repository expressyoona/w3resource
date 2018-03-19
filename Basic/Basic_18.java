import java.util.*;
public class Basic_17 {
  public static int toDec(int n)
  {
    int t = 0,dem = 0;
    while (n != 0)
    {
      if (n % 10 == 1) t += Math.pow(2,dem);
      dem++;
      n /= 10;
    }
    return t;
  }
  public static void main(String[] args) {
  // Write your code here
  Scanner kb = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = kb.nextInt();
		System.out.print("Enter second number: ");
		int b = kb.nextInt();
		System.out.println("Result: "+Integer.toBinaryString(toDec(a) * toDec(b)));
 }
}