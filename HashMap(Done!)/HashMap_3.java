import java.util.*;
public class HashMap_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		HashMap<Character, Integer> hashmap = new HashMap<>();
		hashmap.put('A', 4);
		hashmap.put('B', 3);
		hashmap.put('C', 2);
		hashmap.put('D', 1);
		hashmap.put('F', 0);
		System.out.println("OriginalHashMap: "+hashmap);
		HashMap<Character, Integer> hashmap_clone = new HashMap<>(hashmap);
		System.out.println("New HashMap: "+hashmap_clone);
	}
}
