import java.util.*;
public class Basic_15 {
  public static void main(String[] args) {
  // Write your code here
  Scanner kb = new Scanner(System.in);
  System.out.print("Enter first number: ");
  int a = kb.nextInt();
  System.out.print("Enter second number: ");
  int b = kb.nextInt();
  System.out.println("Before swap: ");
  System.out.println("a = "+a);
  System.out.println("b = "+b);
  int t = a;
  a = b;
  b = t;
  System.out.println("After swap: ");
  System.out.println("a = "+a);
  System.out.println("b = "+b);
 }
}