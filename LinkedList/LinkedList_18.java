import java.util.*;
public class LinkedList_18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		LinkedList<String> linkedlist = new LinkedList<>();
		linkedlist.add("Bierhoff");
		linkedlist.add("Brehme");
		linkedlist.add("Kahn");
		linkedlist.add("Beckenbauer");
		linkedlist.add("Ballack");
		LinkedList<String> linkedlist2 = new LinkedList<>();
		linkedlist2 = (LinkedList<String>) linkedlist.clone();
		System.out.println("LinkedList: " + linkedlist);
		System.out.println("Clone of LinkedList: " + linkedlist2);
	}  
}
