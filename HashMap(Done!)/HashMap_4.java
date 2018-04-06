import java.util.*;
public class HashMap_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		HashMap<Character, Integer> hashmap = new HashMap<>();
		hashmap.put('A', 4);
		hashmap.put('B', 3);
		hashmap.put('C', 2);
		hashmap.put('D', 1);
		hashmap.put('F', 0);
		System.out.println("Original HashMap: "+hashmap);
		hashmap.clear();
		System.out.println("HashMap after remove all element: "+hashmap);
	}
}
