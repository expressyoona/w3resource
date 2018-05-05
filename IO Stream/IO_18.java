import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IO_18 {
	public String findLongestWord() throws FileNotFoundException {
		String longest_word = "";
		String st;
		Scanner sc = new Scanner(new File("F:/text.txt"));
		while (sc.hasNext()) {
			st = sc.next();
			if (st.length() > longest_word.length()) {
				longest_word = st;
			}
		}
		return longest_word;
	}
	public static void main(String[] s) throws FileNotFoundException {
		System.out.println(new IO_().findLongestWord());
	}
}
