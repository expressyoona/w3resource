import java.util.*;
public class TreeSet_14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		TreeSet<Integer> tree_set = new TreeSet<>();
		tree_set.add(10);
		tree_set.add(2);
		tree_set.add(1);
		tree_set.add(6);
		tree_set.add(14);
		tree_set.add(7);
		System.out.println("Original TreeSet: "+tree_set);
		System.out.println("First element: "+tree_set.pollLast());
		System.out.println("Removed last element!");
		System.out.println("New TreeSet: "+tree_set);
		System.out.println("Last element: "+tree_set.last());
	}
}
