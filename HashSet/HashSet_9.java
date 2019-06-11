import java.util.*;
public class HashSet_9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		HashSet<String> hashset = new HashSet<>();
		hashset.add("Kahn");
		hashset.add("Brehme");
		hashset.add("Matthaus");
		hashset.add("Bierhoff");
		List<String> list = new ArrayList<>(hashset);
		System.out.println("HashSet: "+hashset);
		System.out.println("List: "+list);
	}  
}
