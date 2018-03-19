import java.util.Scanner;

public class Basic_61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a word: ");
		String st = kb.nextLine();
		char[] ch = st.toCharArray();
		for (int i = 0;i < ch.length/2;i++)
		{
			char t = ch[i];
			ch[i] = ch[ch.length - i - 1];
			ch[ch.length - i - 1] = t;
		}
		//System.out.println(ch);
		System.out.println("Reserve of word: "+String.valueOf(ch));
	}

}
