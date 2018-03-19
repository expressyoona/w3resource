import java.util.Scanner;

public class Basic_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("The String is: ");
		String st = kb.nextLine();
		int letter = 0, space = 0, number = 0,other = 0;
		for (int i = 0;i < st.length();i++)
		{
			if ((st.charAt(i) >= '0') && (st.charAt(i) <= '9')) number++;
			else if (((st.charAt(i) >= 'a') && (st.charAt(i) <= 'z')) || ((st.charAt(i) >= 'A') && (st.charAt(i) <= 'Z'))) letter++;
			else if (st.charAt(i) == ' ') space++;
			else other++;
		}
		System.out.println("Letter: "+letter);
		System.out.println("Space: "+space);
		System.out.println("Number: "+number);
		System.out.println("Other: "+other);
	}

}
