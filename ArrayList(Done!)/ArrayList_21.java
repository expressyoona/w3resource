import java.util.*;
public class ArrayList_21 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		list.add("White");
		list.add("Black");
		list.add("Yellow");
		list.add("Red");
		list.add("Blue");
		System.out.print("Input a value: ");
		String key = kb.nextLine();
		System.out.println("ArrayList before replace: "+list);
		list.set(1, key);
		System.out.println("ArrayList after replacing: "+list);
	}  
}
