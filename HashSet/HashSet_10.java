import java.util.*;
public class HashSet_10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		HashSet<String> hashset = new HashSet<>();
		hashset.add("Kahn");
		hashset.add("Brehme");
		hashset.add("Matthaus");
		hashset.add("Bierhoff");
		HashSet<String> hashset2 = new HashSet<>();
		hashset2.add("Kahn");
		hashset2.add("Brehme");
		hashset2.add("Matthaus");
		hashset2.add("Bierhoff");
		System.out.println((hashset.equals(hashset2))?"Two HashSet are equal":"Two HashSet are not equal");
	}  
}
