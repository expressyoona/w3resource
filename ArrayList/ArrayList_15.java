import java.util.*;
public class ArrayList_15 {
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
		list2.add("Pink");
		list2.add("Purple");
		list2.add("Green");
		list2.add("Brown");
		List<String> sumList = new ArrayList<>();
		sumList.addAll(list);
		sumList.addAll(list2);
		System.out.println("List 1: "+list);
		System.out.println("List 2: "+list2);
		System.out.println("List 3: "+sumList);
	}  
}
