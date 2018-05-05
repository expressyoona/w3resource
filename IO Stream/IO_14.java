
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IO_14 {
	
	public static void main(String[] s) {
		BufferedReader br = null;
		String st = "";
		ArrayList<String> list = new ArrayList<>();
		try {
			FileReader fr = new FileReader("F:/java.txt");
			br = new BufferedReader(fr);
			while ((st = br.readLine()) != null) {
				list.add(st);
			}
			for(String i: list) {
				System.out.println(i);
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.err.println("File not found.");
		} catch (IOException e) {
			System.err.println("Unable to read the file.");
		}
	}
}
