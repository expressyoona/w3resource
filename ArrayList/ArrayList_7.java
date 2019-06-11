import java.util.*;
public class ArrayList_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		list.add("White");
		list.add("Black");
		list.add("Yellow");
		list.add("Red");
		list.add("Blue");
		System.out.print("Input an element: ");
		String key = kb.nextLine();
		System.out.println((list.contains(key))?"Yes":"No");
	}  
}
