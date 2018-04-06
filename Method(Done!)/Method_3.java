import java.util.*;
public class Method_3 {
	public static String MiddleChar(String st)
	{
		if (st.length() % 2 != 0) return String.valueOf(st.charAt(st.length()/2));
		return st.substring(st.length()/2 - 1, st.length()/2+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a string: ");
		String st = kb.nextLine();
		System.out.println("The middle character of string is: "+MiddleChar(st));
	}  
}
