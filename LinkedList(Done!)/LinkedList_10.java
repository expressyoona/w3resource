import java.util.*;
public class LinkedList_10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		LinkedList<String> linkedlist = new LinkedList<>();
		linkedlist.add("Bierhoff");
		linkedlist.add("Brehme");
		linkedlist.add("Kahn");
		linkedlist.add("Beckenbauer");
		linkedlist.add("Ballack");
		String key = "Ballack";
		System.out.println("LinkedList: "+linkedlist);
		System.out.println("First element is: "+linkedlist.getFirst());
		System.out.println("Last element is: "+linkedlist.getLast());
	}  
}
