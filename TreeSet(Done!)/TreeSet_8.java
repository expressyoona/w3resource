import java.util.*;
public class TreeSet_8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		TreeSet<String> tree_set = new TreeSet<>();
		tree_set.add("Red");
		tree_set.add("Green");
		tree_set.add("Blue");
		tree_set.add("Black");
		tree_set.add("White");
		TreeSet<String> tree_set_2 = new TreeSet<>();
		tree_set_2.add("Black");
		//tree_set_2.add("White");
		tree_set_2.add("Red");
		tree_set_2.add("Green");
		tree_set_2.add("Blue");
		System.out.println((tree_set.equals(tree_set_2))?"Two TreeSet are equal":"Two TreeSet aren't equal");
	}  
}
