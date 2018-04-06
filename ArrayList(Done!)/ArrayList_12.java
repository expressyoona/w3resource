import java.util.*;
public class ArrayList_12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		list.add("White");
		list.add("Black");
		list.add("Yellow");
		list.add("Red");
		list.add("Blue");
		System.out.println("Original List: "+list);
		List<String> sublist = list.subList(1, 3);
		System.out.println("Sublist from 1 to 2 index: "+sublist);
	}  
}
