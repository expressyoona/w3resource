import java.util.*;
public class TreeSet_2 {
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
		Iterator<String> t = tree_set.iterator();
		while (t.hasNext())
			System.out.println(t.next());
	}  
}
