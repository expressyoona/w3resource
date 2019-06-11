import java.util.*;
public class TreeSet_9 {
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
		int ctr = 0;
		for (int i: tree_set)
			if (i < 7) ctr++;
		System.out.println(ctr);
	}  
}
