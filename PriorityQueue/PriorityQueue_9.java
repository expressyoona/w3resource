import java.util.*;
public class PriorityQueue_9 {
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
		System.out.println("First element of queue is: "+queue.poll());
		System.out.println("New Queue: "+queue);
	}
}
