import java.util.Scanner;

public class Basic_60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String st = kb.nextLine();
		int index1 = 0,index2 = 0,dem = 0;
		for (int i = st.length()-1;i > 0;i--)
			{
				if (st.charAt(i) == ' ')
					{
						if (dem == 0)
					
						{
							index1 = i;
							dem++;
						}
						if ((dem == 1) && (index1 != i))
						{
							index2 = i;
							break;
						}
					}
			}
		
		System.out.println(st.substring(index2+1, index1));
		
		
	}

}
