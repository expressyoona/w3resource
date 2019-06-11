import java.util.*;
public class TreeSet_6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		TreeSet<String> tree_set = new TreeSet<>();
		tree_set.add("Red");
		tree_set.add("Green");
		tree_set.add("Blue");
		tree_set.add("Black");
		tree_set.add("White");
		TreeSet<String> clone = new TreeSet<>();
		clone = (TreeSet<String>) tree_set.clone();
		System.out.println("Original TreeSet: "+tree_set);
		System.out.println("Clone: "+clone);
	}  
}
