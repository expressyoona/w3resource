import java.util.*;
public class Method_11 {
	public static boolean check(String pass)
	{
		int digit = 0;
		if (pass.length() < 8) return false;
		for (int i = 0;i < pass.length();i++)
			if (((pass.charAt(i) < 'A') || (pass.charAt(i) > 'Z')) && ((pass.charAt(i) < 'a') || (pass.charAt(i) > 'z')) && ((pass.charAt(i) < '0') || (pass.charAt(i) > '9')))
				{
					return false;
				}
		for (int i = 0;i < pass.length();i++)
			if ((pass.charAt(i) >= '0') && (pass.charAt(i) <= '9')) digit++;
		if (digit < 2) return false;
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a password (You are agreeing to the above Terms and Conditions.): ");
		String pw = kb.nextLine();
		System.out.println(check(pw)?"Password is valid "+pw:"Password is invalid");
		
	}  
}
