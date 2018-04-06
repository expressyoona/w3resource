import java.text.DecimalFormat;
import java.util.*;
public class Math_7 {
	public static int cv(char t)
	{
		switch(t)
		{
		case 'I': return 1;
		case 'V': return 5;
		case 'X': return 10;
		case 'L': return 50;
		case 'C': return 100;
		case 'D': return 500;
		case 'M': return 1000;
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a Roman Number: ");
		String rm = kb.nextLine();
		int t = 0;
		for (int i = 0;i < rm.length() - 1;i++)
			if (cv(rm.charAt(i)) < cv(rm.charAt(i + 1))) t -= cv(rm.charAt(i));
			else t += cv(rm.charAt(i));
		t += cv(rm.charAt(rm.length() - 1));
		System.out.println("Integer number: "+t);
	}
}
