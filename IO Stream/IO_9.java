import java.io.File;
import java.util.*;
public class IO_9 {
	public static long byteTokilo(long n) {
		return n/1024;
	}
	public static long byteTomega(long n) {
		return n/1024/1024;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("E:\\Software\\Wing_Photoshop.zip");
		System.out.println("Size of the file is: ");
		System.out.println(f.length() + " B");
		System.out.println(byteTokilo(f.length()) + " KB");
		System.out.println(byteTomega(f.length()) + " MB");
	}
}
