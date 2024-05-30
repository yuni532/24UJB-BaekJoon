package Z1152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		int cnt =0;
		if (!A.equals(" ")) {
		String trim = A.trim();
		 cnt = trim.split(" ").length;
		}else if ( A.equals(" ")){
			cnt=0;
		}
		
		System.out.println(cnt);
	}

}
