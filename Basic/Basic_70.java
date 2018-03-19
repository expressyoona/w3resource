import java.util.Scanner;

public class Basic_70 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input first string: ");
		String st1 = kb.nextLine();
		System.out.print("Input second string: ");
		String st2 = kb.nextLine();
		if (st1.length() > st2.length())
			System.out.print(st2 + st1 + st2);
		else
			System.out.print(st1 + st2 + st1);
	}

}
