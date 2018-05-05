
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

public class IO_17 {
	
	public static void main(String[] s) {
		BufferedReader br = null;
		FileReader fr = null;
		String str = null;
		String pathname = "F:/text.txt";
		try {
			
			fr = new FileReader(pathname);
			br = new BufferedReader(fr);
			LineNumberReader line = new LineNumberReader(new InputStreamReader(new FileInputStream(pathname), "UTF-8"));	
			while (((str = line.readLine()) != null) && (line.getLineNumber() <= 3)){
				System.out.println(str);
			}
			line.close();
			System.out.println("Done!");
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("IOException error");
		}
	}
}
