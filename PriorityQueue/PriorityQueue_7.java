import java.util.*;
public class PriorityQueue_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Red");
		queue.add("Green");
		queue.add("Blue");
		queue.add("White");
		queue.add("Black");
		System.out.println("Queue 1: "+queue);
		PriorityQueue<String> queue_2 = new PriorityQueue<>();
		queue_2.add("Red");
		queue_2.add("Black");
		queue_2.add("Green");
		queue_2.add("Blue");
		queue_2.add("White");
		System.out.println("Queue 2: "+queue_2);
		if (queue.equals(queue_2)) System.out.println("Two Queue are equal");
		else System.out.println("Two Queue are not equal");
	}
}
