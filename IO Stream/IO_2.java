import java.io.File;
import java.util.*;
public class IO_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("F:/");
		String ex = new String("txt");
		String[] list = f.list();
		for(String i: list) {
			if (i.endsWith(ex)) System.out.println(i);
		}
	}
}
