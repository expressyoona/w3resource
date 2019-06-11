import java.util.*;
public class LinkedList_17 {
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
		linkedlist2.add("Neuer");
		linkedlist2.add("Lahm");
		linkedlist2.add("Kroos");
		LinkedList<String> SumList = new LinkedList<>();
		SumList.addAll(linkedlist);
		SumList.addAll(linkedlist2);
		System.out.println("LinkedList 1: "+linkedlist);
		System.out.println("LinkedList 2: "+linkedlist2);
		System.out.println("LinkedList 3: "+SumList);
	}  
}
