import java.util.*;
public class ArrayList_20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>(2);
		list.add("White");
		list.add("White");
		list.ensureCapacity(6);
		list.add("Black");
		list.add("Yellow");
		list.add("Red");
		list.add("Blue");
		System.out.println("List: "+list);
	}  
}
