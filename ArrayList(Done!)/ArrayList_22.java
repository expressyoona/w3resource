import java.util.*;
public class ArrayList_22 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		list.add("White");
		list.add("Black");
		list.add("Yellow");
		list.add("Red");
		list.add("Blue");
		for (int i = 0;i < list.size();i++)
			System.out.print(list.get(i) + "\t");
	}  
}
