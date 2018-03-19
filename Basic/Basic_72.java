import java.util.Scanner;

public class Basic_72 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a string: ");
		String st = kb.nextLine();
		if (st.length() > 3) System.out.println(st.substring(0, 3));
		else
			System.out.println("###");
	}

}
