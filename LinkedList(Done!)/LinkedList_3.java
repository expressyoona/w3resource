import java.util.*;
public class LinkedList_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		LinkedList<String> linkedlist = new LinkedList<>();
		linkedlist.add("Bierhoff");
		linkedlist.add("Brehme");
		linkedlist.add("Kahn");
		linkedlist.add("Beckenbauer");
		linkedlist.add("Ballack");
		int index = 2;
		for (int i = index;i < linkedlist.size();i++)
			System.out.println(linkedlist.get(i));
	}  
}
