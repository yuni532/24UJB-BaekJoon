package Z2441;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		int cnt = N;
		for(int i = 0;i<N;i++) {
			for(int j =1; j<=cnt;j++) {
				if(j>i) {
					
					System.out.print("*");
				}else if (j<=i){
					
					System.out.print(" ");
				}
				
			}
			System.out.println("");
		}

	}

}
