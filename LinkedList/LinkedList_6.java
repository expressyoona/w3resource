import java.util.*;
public class LinkedList_6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		LinkedList<String> linkedlist = new LinkedList<>();
		linkedlist.add("Bierhoff");
		linkedlist.add("Brehme");
		linkedlist.add("Kahn");
		linkedlist.add("Beckenbauer");
		linkedlist.add("Ballack");
		String key = "Effenberg";
		System.out.println("LinkedList before insert: "+linkedlist);
		linkedlist.add(0, key);
		linkedlist.add(key);
		System.out.println("LinkedList after inserting: "+linkedlist);
	}  
}
