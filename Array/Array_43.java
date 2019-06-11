import java.util.*;
public class Array_43 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = {4, 6, 2, -3, 5, 4, 0, 3}; //Length = 8
		int target = 12;
		for (int i = 0;i < A.length - 3;i++) //i chạy từ 0 tới 4
			for (int j = i + 1;j < A.length - 2;j++)//j chạy từ 1 tới 5
				for (int k = j + 1;k < A.length - 1;k++)//k chạy từ 2 tới 6
					for (int l = k + 1;l < A.length;l++)//l chạy từ 3 tới 7
							if (target == A[i] + A[j] + A[k] + A[l]) System.out.println(A[i]+", "+A[j]+", "+A[k]+", "+A[l]);
	}  
}
