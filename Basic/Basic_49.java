import java.util.*;
 public class Basic_49 {
     public static void main(String[] args){
       Scanner kb = new Scanner(System.in);
       System.out.print("Input number: ");
       int n = kb.nextInt();
       System.out.print((n % 2 == 0)?1:0);
    }
}
