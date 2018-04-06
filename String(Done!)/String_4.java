import java.util.*;
public class String_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String st = "Hello World";
		System.out.println("String: "+st);
		System.out.print("Input the range: ");
		int m = kb.nextInt();
		int n = kb.nextInt();
		int ctr = st.codePointCount(m, n);
		System.out.println("Codepoint count = "+ctr);
	}  
}
