import java.util.*;
public class LinkedList_16 {
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
		Collections.shuffle(linkedlist);
		System.out.println("LinkedList after shuffling: "+linkedlist);
	}  
}
