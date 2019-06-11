import java.util.*;
public class Array_21 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		list.add("ANC");
		list.add("DJR");
		list.add("MXJ");
		list.add("LAO");
		list.add("ABX");
		String A[] = new String[list.size()];
		list.toArray(A);
		System.out.println(Arrays.toString(A));
	}
}
