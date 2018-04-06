import java.util.*;
public class ArrayList_13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		list.add("White");
		list.add("Black");
		list.add("Yellow");
		list.add("Red");
		list.add("Blue");
		List<String> list2 = new ArrayList<>();
		list2.add("White");
		list2.add("Black");
		list2.add("Yellow");
		list2.add("Red");
		list2.add("Blue");
		System.out.println((list.equals(list2))?"Two list are equal":"Two list aren't equal");
		
	}  
}
