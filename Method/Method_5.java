import java.util.*;
public class Method_5 {
	public static int CountWord(String st)
	{
		int ctr = 1;
		for (int i = 0;i < st.length();i++)
			if (st.charAt(i) == ' ')
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
		System.out.println("Number of word in the string is: "+CountWord(st));
	}  
}
