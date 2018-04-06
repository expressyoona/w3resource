import java.util.*;
public class PriorityQueue_12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Red");
		queue.add("Green");
		queue.add("Blue");
		queue.add("White");
		queue.add("Black");
		System.out.println("Original PriorityQueue: "+queue);
		String st = null;
		System.out.print("Maximum PriorityQueue: ");
		while ((st = queue.poll()) != null)
		{
			System.out.print(st + " ");
		}
		
	}
}
