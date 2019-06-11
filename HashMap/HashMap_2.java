import java.util.*;
public class HashMap_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		HashMap<Character, Integer> hashmap = new HashMap<>();
		hashmap.put('A', 4);
		hashmap.put('B', 3);
		hashmap.put('C', 2);
		hashmap.put('D', 1);
		hashmap.put('F', 0);
		System.out.println("HashMap: "+hashmap);
		System.out.println("Number of key - value in HashMap: "+hashmap.size());
	}
}
