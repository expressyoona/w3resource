import java.util.Scanner;
public class Conditional_8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a letter: ");
		String st = kb.nextLine();
		if (((st.charAt(0) >= 'A') && (st.charAt(0) <= 'Z')) || ((st.charAt(0) >= 'a') && (st.charAt(0) <= 'z')))
		{
			if (st.equals("u") || st.equals("e") || st.equals("o") || st.equals("a") || st.equals("i"))
			{
				System.out.println("Input letter is Vowel");
			}
			else
			{
				System.out.println("Input letter is Consonant");
			}
		}
		else System.out.println("Input is not a letter");
	}
}


