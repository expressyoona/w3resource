import java.util.*;
public class TreeMap_6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		TreeMap<Character, Integer> treemap = new TreeMap<>();
		treemap.put('A', 4);
		treemap.put('B', 3);
		treemap.put('C', 2);
		treemap.put('D', 1);
		treemap.put('F', 0);
		System.out.println("TreeMap: "+treemap);
		treemap.clear();
		System.out.println("TreeMap after remove all element: "+treemap);
	}
}
