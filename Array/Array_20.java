import java.util.ArrayList;
import java.util.Arrays;
	import java.util.Scanner;
	
	public class Array_20 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner kb = new Scanner(System.in);
			String A[] = {"Hoang", "Tan", "Hieu", "Dung"};
			ArrayList<String> list = new ArrayList<String>();
			list.addAll(Arrays.asList(A));
			System.out.println("Array: "+Arrays.toString(A));
			System.out.println("ArrayList: "+list);
		}
	}
