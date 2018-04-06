import java.util.*;
public class PriorityQueue_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Red");
		queue.add("Green");
		queue.add("Blue");
		queue.add("White");
		queue.add("Black");
		PriorityQueue<String> queue_clone = new PriorityQueue<>(queue);
		System.out.println("Original Queue: "+queue);
		System.out.println("New Queue: "+queue_clone);
		
	}
}
