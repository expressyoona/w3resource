import java.util.Scanner;

public class Basic_69 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a string: ");
		String st = kb.nextLine();
		System.out.println("Result: "+st.substring(0, st.length()/2));
	}

}
