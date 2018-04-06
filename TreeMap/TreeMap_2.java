import java.util.*;
public class TreeMap_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		TreeMap<Character, Integer> treemap = new TreeMap<>();
		treemap.put('A', 4);
		treemap.put('B', 3);
		treemap.put('C', 2);
		treemap.put('D', 1);
		treemap.put('F', 0);
		TreeMap<Character, Integer> treemap_clone = new TreeMap<>(treemap);
		System.out.println("Original TreeMap: "+treemap);
		System.out.println("New TreeMap: "+treemap_clone);
	}
}
