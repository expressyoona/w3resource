import java.util.*;
public class ArrayList_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		list.add("White");
		list.add("Black");
		list.add("Yellow");
		list.add("Red");
		list.add("Blue");
		System.out.println("ArrayList before replace: "+list);
		list.set(2, "Green");
		System.out.println("ArrayList after replacing: "+list);
	}  
}
