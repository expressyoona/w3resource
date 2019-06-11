import java.util.*;
public class LinkedList_24 {
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
		linkedlist2.add("Bierhoff");
		linkedlist2.add("Brehme");
		linkedlist2.add("Kahn");
		linkedlist2.add("Beckenbauer");
		linkedlist2.add("Ballack");
		System.out.println((linkedlist.equals(linkedlist2))?"Two LinkedList are equal":"Two LinkedList aren't equal");
	}  
}
