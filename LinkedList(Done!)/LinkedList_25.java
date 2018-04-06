import java.util.*;
public class LinkedList_25 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		LinkedList<String> linkedlist = new LinkedList<>();
		linkedlist.add("Bierhoff");
		linkedlist.add("Brehme");
		linkedlist.add("Kahn");
		linkedlist.add("Beckenbauer");
		linkedlist.add("Ballack");
		System.out.println("LinkedList before remove all element: "+linkedlist);
		if (!linkedlist.isEmpty()) System.out.println("LinkedList is not empty");
		System.out.println("Removing all element...");
		linkedlist.removeAll(linkedlist);
		System.out.println("LinkedList after remove all element: "+linkedlist);
		if (linkedlist.isEmpty()) System.out.println("LinkedList is empty");
	}  
}
