import java.util.*;
public class LinkedList_9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		LinkedList<String> linkedlist = new LinkedList<>();
		linkedlist.add("Bierhoff");
		linkedlist.add("Brehme");
		linkedlist.add("Kahn");
		linkedlist.add("Beckenbauer");
		linkedlist.add("Ballack");
		String key1 = "Effenberg";
		String key2 = "Muller";
		System.out.println("LinkedList before insert: "+linkedlist);
		linkedlist.add(2, key1);
		linkedlist.add(4, key2);
		System.out.println("LinkedList after inserting: "+linkedlist);
	}  
}
