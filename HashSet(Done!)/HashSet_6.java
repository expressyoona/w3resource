import java.util.*;
public class HashSet_6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		HashSet<String> hashset = new HashSet<>();
		hashset.add("Kahn");
		hashset.add("Brehme");
		hashset.add("Matthaus");
		hashset.add("Bierhoff");
		HashSet<String> hashset2 = new HashSet<>();
		hashset2 = (HashSet<String>) hashset.clone();
		System.out.println("HashSet: "+hashset);
		System.out.println("HashSet's clone: "+hashset2);
	}  
}
