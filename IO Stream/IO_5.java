import java.io.File;
import java.util.*;
public class IO_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("F:/");
		if (f.isDirectory()) {
			System.out.println("The pathname is a directory");
		}
		if (f.isFile()) {
			System.out.println("The pathname is a file");
		}
	}
}
