import java.util.*;
public class HashMap_8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		HashMap<Character, Integer> hashmap = new HashMap<>();
		hashmap.put('A', 4);
		hashmap.put('B', 3);
		hashmap.put('C', 2);
		hashmap.put('D', 1);
		hashmap.put('F', 0);
		System.out.print("Input a value: ");
		Integer t = kb.nextInt();
		if (hashmap.containsValue(t)) System.out.println("Value is exist");
		else System.out.println("Value is not exist");
	}
}