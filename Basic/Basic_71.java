import java.util.Scanner;

public class Basic_71 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input first string: ");
		String st1 = kb.nextLine();
		System.out.print("Input second string: ");
		String st2 = kb.nextLine();
		System.out.println(st1.substring(1, st1.length())+st2.substring(1, st2.length()));
	}

}
