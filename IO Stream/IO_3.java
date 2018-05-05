import java.io.File;
import java.util.*;
public class IO_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("F:/Video");
		if (f.exists()) {
			System.out.println("The filename or directory is exists");
		}
		else {
			System.out.println("The filename or directory is not exists");
		}
	}
}
