import java.util.*;
public class ArrayList_16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		list.add("White");
		list.add("Black");
		list.add("Yellow");
		list.add("Red");
		list.add("Blue");
		ArrayList<String> list2 = new ArrayList<>();
		//list2.addAll(list);
		list2 = (ArrayList<String>) list.clone();
		System.out.println("List 1: "+list);
		System.out.println("Clone of list 1: "+list2);
	}  
}
