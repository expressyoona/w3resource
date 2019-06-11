import java.util.*;
public class HashMap_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		HashMap<Character, Integer> hashmap = new HashMap<>();
		hashmap.put('A', 4);
		hashmap.put('B', 3);
		hashmap.put('C', 2);
		hashmap.put('D', 1);
		hashmap.put('F', 0);
		for (Map.Entry t: hashmap.entrySet())
		{
			System.out.println(t.getKey() + " -> " + t.getValue());
		}
	}
}
