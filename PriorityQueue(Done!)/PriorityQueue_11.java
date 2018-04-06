import java.util.*;
public class PriorityQueue_11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Red");
		queue.add("Green");
		queue.add("Blue");
		queue.add("White");
		queue.add("Black");
		String st = queue.toString();
		System.out.println("PriorityQueue: "+queue);
		System.out.println("String: "+st);
	}
}
