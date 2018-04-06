import java.util.*;
public class String_18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String st = "1. This is a string";
		for (int i = 0;i < st.length();i++)
			if (((st.charAt(i) >= 'A') && (st.charAt(i) <= 'Z')) || ((st.charAt(i) >= 'a') && (st.charAt(i) <= 'z')))
			{
				System.out.print("\t"+i);
			}
	}  
}
