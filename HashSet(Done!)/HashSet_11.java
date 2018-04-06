import java.util.*;
public class HashSet_11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		HashSet<String> hashset = new HashSet<>();
		hashset.add("Kahn");
		hashset.add("Brehme");
		hashset.add("Matthaus");
		hashset.add("Bierhoff");
		HashSet<String> hashset2 = new HashSet<>();
		hashset2.add("Beckenbauer");
		hashset2.add("Matthaus");
		hashset2.add("Brehme");
		hashset2.add("Ballack");
		System.out.println("First HashSet: "+hashset);
		System.out.println("Second HashSet: "+hashset2);
		hashset2.retainAll(hashset);
		System.out.println("HashSet content: "+hashset2);
	}  
}
