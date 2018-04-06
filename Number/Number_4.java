import java.util.*;
public class Number_4 {
	public static boolean isKaprekarNumber(int n)
	{
		if (n == 1) return true;
		if (n * n < 10) return false;
		String st = String.valueOf(n*n);
		String sub1 = st.substring(0, st.length()/2);
		String sub2 = st.substring(st.length()/2);
		int SOD = Integer.parseInt(sub1) + Integer.parseInt(sub2);
		return (SOD == n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		for (int i = 1;i <= 1000;i++)
			if (isKaprekarNumber(i)) System.out.println(i);
	}  
}
