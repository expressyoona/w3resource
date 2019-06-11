import java.util.*;
public class String_6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String st1 = "Le Binh";
		String st2 = "Le biNH";
		int result = st1.compareToIgnoreCase(st2);
		System.out.println("First string: "+st1);
		System.out.println("Second string: "+st2);
		System.out.println((result == 0)?"String 1 equal string 2":(result < 0)?"String 1 less than string 2":"String 1 greater than string 2");
	}  
}
