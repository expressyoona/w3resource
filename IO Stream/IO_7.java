import java.io.File;
import java.util.*;
public class IO_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("F:/java.txt");
		Date date  = new Date(f.lastModified());
		System.out.println("The last modified time of file is " + date);
	}
}
