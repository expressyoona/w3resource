import java.util.*;
public class Method_4 {
	public static int CountVowel(String st)
	{
		int ctr = 0;
		for (int i = 0;i < st.length();i++)
			if ((st.charAt(i) == 'u') || (st.charAt(i) == 'e') || (st.charAt(i) == 'o') || (st.charAt(i) == 'a') || (st.charAt(i) == 'i') || (st.charAt(i) == 'U') || (st.charAt(i) == 'E') || (st.charAt(i) == 'O') || (st.charAt(i) == 'A') || (st.charAt(i) == 'I'))
			{
				ctr++;
			}
		return ctr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a string: ");
		String st = kb.nextLine();
		System.out.println("Number of vowel in the string is: "+CountVowel(st));
	}  
}
