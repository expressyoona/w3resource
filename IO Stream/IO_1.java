import java.io.File;
import java.util.*;
public class IO_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("F:/");
		String[] list = f.list();
		for(String i: list) {
			System.out.println(i);
		}
	}
}
