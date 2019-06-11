import java.util.*;
public class HashMap_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		HashMap<Character, Integer> hashmap = new HashMap<>();
		hashmap.put('A', 4);
		hashmap.put('B', 3);
		hashmap.put('C', 2);
		hashmap.put('D', 1);
		hashmap.put('F', 0);
		if (!hashmap.isEmpty())
			{
				System.out.println("Original HashMap: "+hashmap);
				System.out.println("HashMap is not empty");
				System.out.println("Removing all element...");
				hashmap.clear();
			}
		System.out.println("HashMap: "+hashmap);
		System.out.println("HashMap is empty");
	}
}
