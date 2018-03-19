import java.util.*;
public class Basic_6 {
  public static void main(String[] args) {
  // Write your code here
  Scanner kb = new Scanner(System.in);
  System.out.print("Enter first number: ");
  int a = kb.nextInt();
  System.out.print("Enter second number: ");
  int b = kb.nextInt();
  System.out.println(a + " + " + b + " = " + (a+b));
  System.out.println(a + " - " + b + " = " + (a-b));
  System.out.println(a + " x " + b + " = " + (a*b));
  System.out.println(a + " / " + b + " = " + (a/b));
  System.out.println(a + " mod " + b + " = " + (a%b));
 }
}