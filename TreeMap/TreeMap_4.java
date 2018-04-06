import java.util.*;
public class TreeMap_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		TreeMap<Character, Integer> treemap = new TreeMap<>();
		treemap.put('A', 4);
		treemap.put('B', 3);
		treemap.put('C', 2);
		treemap.put('D', 1);
		treemap.put('F', 0);
		System.out.print("Input a value: ");
		int vl = kb.nextInt();
		if (treemap.containsValue(vl)) System.out.println("TreeMap contain value "+vl);
		else System.out.println("Value not found");
	}
}
