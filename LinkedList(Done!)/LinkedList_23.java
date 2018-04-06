import java.util.*;
public class LinkedList_23 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		LinkedList<String> linkedlist = new LinkedList<>();
		linkedlist.add("Bierhoff");
		linkedlist.add("Brehme");
		linkedlist.add("Kahn");
		linkedlist.add("Beckenbauer");
		linkedlist.add("Ballack");
		ArrayList<String> arraylist = new ArrayList<>(linkedlist);
		System.out.println("LinkedList: "+linkedlist);
		System.out.println("ArrayList: "+arraylist);
	}  
}
