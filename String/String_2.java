import java.util.*;
public class String_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String st = "Hello Word";
		System.out.println("String: "+st);
		System.out.print("Input the position: ");
		int k = kb.nextInt();
		System.out.println("The Unicode Code Point at position "+k+" is: "+st.codePointAt(k));
	}  
}
