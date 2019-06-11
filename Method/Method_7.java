import java.util.*;
public class Method_7 {
	public static boolean isPentagonalNum(int x)
	{
		double n =(Math.sqrt(24*x + 1) + 1)/6;
		if (Math.round(n) - n == 0) return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int ctr = 0;
		int i = 1;
		while (ctr < 50)
		{
			if (isPentagonalNum(i))
			{
				ctr++;
				if (ctr % 10 != 0) System.out.print(i + "\t");
				else System.out.println(i + "\t");
				
			}
			i++;
		}
	}  
}
