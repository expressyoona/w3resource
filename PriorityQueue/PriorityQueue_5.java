import java.util.*;
public class PriorityQueue_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Red");
		queue.add("Green");
		queue.add("Blue");
		queue.add("White");
		queue.add("Black");
		System.out.println("Original Queue: "+queue);
		queue.removeAll(queue);
		System.out.println("Queue after remove all element: "+queue);
	}
}
