import java.util.*;
public class ArrayList_14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		list.add("White");
		list.add("Black");
		list.add("Yellow");
		list.add("Red");
		list.add("Blue");
		System.out.println("ArrayList before swap: "+list);
		Collections.swap(list, 0, 4);
		System.out.println("ArrayList before swaping first and last element: "+list);
		
	}  
}
