import java.util.*;
public class Number_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the range: ");
		int n = kb.nextInt();
		Random rd = new Random();
		System.out.println(rd.nextInt(n));
	}  
}
