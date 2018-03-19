import java.util.*;
 public class Basic_55 {
     public static void main(String[] args){
       Scanner kb = new Scanner(System.in);
       System.out.print("Input second: ");
       long s = kb.nextInt();
       long h = s / 3600;
       long m = (s - h*3600) / 60;
       s = s - h*3600 - m*60;
       System.out.print(h+":"+m+":"+s);
     }
    }
