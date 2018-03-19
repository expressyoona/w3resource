import java.util.Scanner;
public class Conditional_15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input number: ");
		int n = kb.nextInt();
		System.out.println("The odd number is: ");
		int dem = 1,i=1,S = 0;
		while (dem <= n)
		{
			System.out.println(i);
			S += i;
			i += 2;
			dem++;
		}
		System.out.println("The sum of "+n+" odd numbers is: "+S);
	}
}


