import java.util.*;
public class HashSet_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		HashSet<String> hashset = new HashSet<>();
		hashset.add("Kahn");
		hashset.add("Brehme");
		hashset.add("Matthaus");
		hashset.add("Bierhoff");
		//for (String i: hashset)
		//	System.out.println(i);
		//System.out.println("Hashset: "+hashset);
		Iterator<String> t = hashset.iterator();
		while (t.hasNext())
			System.out.println(t.next());
	}  
}
