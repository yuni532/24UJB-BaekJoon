package Z1913;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int A = sc.nextInt();
	//int B = sc.nextInt();
	int[][] arr = new int[A][A];
	
	int str = 1;
//	System.out.println((A/2)+1);
// A/2	
	for(int i = 0; i<A;i++) {
		for(int j=0; j<A; j++) {
			
			arr[i][j] = str;
			str ++;
			
			
			System.out.print(arr[i][j]+ " ");
		}
		System.out.println("");
	}
	
		
		
	}

}
// 좀 더 풀어봐야될듯