import java.util.*;
public class ArrayList_6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		list.add("White");
		list.add("Black");
		list.add("Yellow");
		list.add("Red");
		list.add("Blue");
		System.out.println("ArrayList before remove: "+list);
		list.remove(2);
		System.out.println("ArrayList after removing: "+list);
	}  
}
