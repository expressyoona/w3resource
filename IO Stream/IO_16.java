
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IO_16 {
	
	public static void main(String[] s) {
		BufferedReader br = null;
		FileReader fr = null;
		String pathname = "F:/text.txt";
		String st = "Programming with w3resource";
		String str = "";
		try {
			FileWriter fw = new FileWriter(pathname, true);
			fw.write("\nJava is the best");
			fw.close();
			System.out.println("Write file sucessfully!");
			fr = new FileReader(pathname);
			br = new BufferedReader(fr);
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			System.out.println("Done!");
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("IOException error");
		}
	}
}
