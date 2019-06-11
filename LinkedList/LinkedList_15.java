import java.util.*;
public class LinkedList_15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		LinkedList<String> linkedlist = new LinkedList<>();
		linkedlist.add("Bierhoff");
		linkedlist.add("Brehme");
		linkedlist.add("Kahn");
		linkedlist.add("Beckenbauer");
		linkedlist.add("Ballack");
		System.out.println("Original LinkedList: "+linkedlist);
		Collections.swap(linkedlist, 0, 3);
		System.out.println("LinkedList after swapping first and fourth element: "+linkedlist);
	}  
}
