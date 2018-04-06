import java.util.*;
public class ArrayList_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		list.add("White");
		list.add("Black");
		list.add("Yellow");
		list.add("Red");
		list.add("Blue");
		System.out.println("Input the position: ");
		int k = kb.nextInt();
		System.out.println("Value at "+k+" position is: "+list.get(k));
	}  
}
