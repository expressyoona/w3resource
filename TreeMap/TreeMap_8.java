import java.util.*;
public class TreeMap_8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		TreeMap<Character, Integer> treemap = new TreeMap<>();
		treemap.put('A', 4);
		treemap.put('C', 2);
		treemap.put('B', 3);
		treemap.put('F', 0);
		treemap.put('D', 1);
		System.out.println("TreeMap: "+treemap);
		System.out.println("Value of greatest key: "+treemap.get(treemap.firstKey()));
		System.out.println("Value of least key: "+treemap.get(treemap.lastKey()));
	}
}
