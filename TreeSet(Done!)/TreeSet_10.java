import java.util.*;
public class TreeSet_10 {
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
		System.out.println("Input a number: ");
		int k = kb.nextInt();
		System.out.printf("Greater than or equal to %d: %d",k,tree_set.ceiling(k));
	}  
}
