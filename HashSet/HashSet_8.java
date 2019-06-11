import java.util.*;
public class HashSet_8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		HashSet<String> hashset = new HashSet<>();
		hashset.add("Kahn");
		hashset.add("Brehme");
		hashset.add("Matthaus");
		hashset.add("Bierhoff");
		TreeSet<String> tree_set = new TreeSet<>(hashset);
		System.out.println("HashSet: "+hashset);
		System.out.println("TreeSet: "+tree_set);
	}  
}
