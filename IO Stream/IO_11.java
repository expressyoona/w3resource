import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IO_11 {
	
	public static void main(String[] s) {
		BufferedReader br = null;
		String st = "";
		try {
			FileReader fr = new FileReader("F:/java.txt");
			br = new BufferedReader(fr);
			while ((st = br.readLine()) != null) {
				System.out.println(st);
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.err.println("File not found.");
		} catch (IOException e) {
			System.err.println("Unable to read the file.");
		}
	}
}
