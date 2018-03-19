import java.util.Scanner;

public class Basic_78 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = new int[2];
		A[0] = kb.nextInt();
		A[1] = kb.nextInt();
		System.out.print(((A[0] == 4) || (A[0] == 7) || (A[1] == 4) || (A[1] == 7)?"True":"False"));
	}

}
