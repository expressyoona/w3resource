import java.util.*;
public class Basic_7 {
  public static void main(String[] args) {
  // Write your code here
  Scanner kb = new Scanner(System.in);
  System.out.print("Enter a number: ");
  int a = kb.nextInt();
  for (int i = 1;i <= 10;i++)
    System.out.println(a + " x " + i + " = " + (i*a));
 }
}