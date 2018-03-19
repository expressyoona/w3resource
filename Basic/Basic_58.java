import java.util.Scanner;

public class Basic_58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String st = kb.nextLine();
		char[] ch = st.toCharArray();
		ch[0] -= 32;
		for (int i = 0;i < ch.length;i++)
			if (ch[i] == ' ') ch[i+1] -= 32;
		System.out.print(ch);
		
	}

}
