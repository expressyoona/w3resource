import java.util.Arrays;
import java.util.Scanner;

public class Basic_84 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a string: ");
		String st = kb.nextLine();
		System.out.print(st.substring(st.length()-3, st.length()) + st + st.substring(st.length()-3, st.length()));
	}

}
