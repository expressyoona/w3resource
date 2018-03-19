import java.util.*;
public class DataType_4
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the number of minutes: ");
		long minute = kb.nextInt();
		long year = minute / (24 * 60 * 365);
		long day = (minute - year * (24 * 60 * 365))/(24*60);
		System.out.print(minute + "minutes is approximately " + year + " years and " + day + "days");
	}
}