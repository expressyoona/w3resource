import java.util.*;
 public class Basic_50 {
     public static void main(String[] args){
       Scanner kb = new Scanner(System.in);
       System.out.print("Divided by 3: ");
       for (int i = 3;i <= 100;i+=3)
       {
         System.out.print(i + " ");
       }
       System.out.print("\nDivided by 5: ");
       for (int i = 5;i <= 100;i+=5)
       {
         System.out.print(i + " ");
       }
       System.out.print("\nDivided by 3 and 5: ");
       for (int i = 15;i <= 100;i+=15)
       {
         System.out.print(i + " ");
       }
    }
}
