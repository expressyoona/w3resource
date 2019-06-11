import java.util.*;
public class TreeSet_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		TreeSet<String> tree_set = new TreeSet<>();
		tree_set.add("Red");
		tree_set.add("Green");
		tree_set.add("Blue");
		tree_set.add("Black");
		tree_set.add("White");
		//System.out.println("TreeSet: "+tree_set);
		TreeSet<String> tree_set_2 = new TreeSet<>();
		tree_set_2.addAll(tree_set);
		System.out.println("Original TreeSet: "+tree_set);
		System.out.println("New TreeSet: "+tree_set_2);
	}  
}
