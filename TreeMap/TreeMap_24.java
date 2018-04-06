import java.util.*;
public class TreeMap_24 {
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
		char key = 'E';
		System.out.println(treemap.tailMap(key, false));
	}
}
