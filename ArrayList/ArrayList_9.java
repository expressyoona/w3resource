import java.util.*;
public class ArrayList_9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		list.add("White");
		list.add("Black");
		list.add("Yellow");
		list.add("Red");
		list.add("Blue");
		System.out.println("Original ArrayList: "+list);
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("James");
		list2.add("David");
		list2.add("John");
		list2.add("Wiliam");
		list2.add("Teflu");
		Collections.copy(list, list2);
		System.out.println("New ArrayList: "+list2);
	}  
}
