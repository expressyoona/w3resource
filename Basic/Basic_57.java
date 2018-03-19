import java.util.*;
 public class Basic_57 {
     public static void main(String[] args){
      Scanner kb = new Scanner(System.in);
      System.out.print("Input an integer: ");
      int n = kb.nextInt();
      int dem = 0;
      for (int i = 1;i <= n;i++)
        if (n % i == 0) dem++;
      System.out.print(dem);
     }
    }
