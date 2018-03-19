import java.util.*;
public class Basic_26 {
  public static int toDec(int n)
  {
    int t = 0,dem = 0;
    while (n != 0)
    {
      t += Math.pow(8,dem) * (n % 10);
      dem++;
      n /= 10;
    }
    return t;
  }
  public static void main(String[] args) {
  // Write your code here
  Scanner kb = new Scanner(System.in);
		System.out.print("Enter a octal number: ");
		int a = kb.nextInt();
		
		System.out.println("Result: "+Integer.toBinaryString(toDec(a)));
 }
}