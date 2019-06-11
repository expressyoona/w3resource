import java.util.*;
public class HashSet_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		HashSet<String> hashset = new HashSet<>();
		hashset.add("Kahn");
		hashset.add("Brehme");
		hashset.add("Matthaus");
		hashset.add("Bierhoff");
		System.out.println("Original HashSet: "+hashset);
		if (!hashset.isEmpty()) System.out.println("HashSet isn't empty");
		hashset.removeAll(hashset);
		System.out.println("Removing all element...");
		System.out.println("HashSet after remove all element: "+hashset);
		if (hashset.isEmpty()) System.out.println("HashSet is empty");
	}  
}
