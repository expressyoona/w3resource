import java.util.*;
public class LinkedList_26 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		LinkedList<String> linkedlist = new LinkedList<>();
		linkedlist.add("Bierhoff");
		linkedlist.add("Brehme");
		linkedlist.add("Kahn");
		linkedlist.add("Beckenbauer");
		linkedlist.add("Ballack");
		String key = "Joachim Loew";
		System.out.println("Original LinkedList: "+linkedlist);
		linkedlist.set(2, key);
		System.out.println("LinkedList after replacing: "+linkedlist);
	}  
}
