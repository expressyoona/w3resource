import java.io.File;
import java.util.*;
public class IO_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:/Users");
		if (f.canRead() && f.canWrite()) {
			System.out.println("The filename or directory has read and write permission.");
		}
		else {
			System.out.println("The filename or directory hasn't read or write permission.");
		}
	}
}
