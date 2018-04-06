import java.util.*;
public class String_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String st1 = "Le Binh";
		String st2 = "Le Anh";
		int result = st1.compareTo(st2);
		System.out.println("First string: "+st1);
		System.out.println("Second string: "+st2);
		System.out.println((result == 0)?"String 1 equal string 2":(result < 0)?"String 1 is less than string 2":"String 1 is greater than string 2");
	}  
}
