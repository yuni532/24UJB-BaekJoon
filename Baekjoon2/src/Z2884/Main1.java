package Z2884;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		
		if (M<60) {
			H-=1;
			M+=60;
			System.out.println(H+ " " + M);
		}
		M-=45;
		if(M>=60) {
			H+= 1;
			M-=60;
			System.out.println(H+ " " + M);
			}
		if (H<=0) {
			H=24+H;
			System.out.println(H+ " " + M);
		}
		if (H>=24) {
			H-=24;
		}
		System.out.println(H+ " " + M);
	}
}

