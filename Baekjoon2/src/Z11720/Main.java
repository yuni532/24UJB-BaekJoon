package Z11720;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int A =sc.nextInt();
		String B =sc.next();
		String[] C = B.split("");
		
		int cnt =0;
		for(int i=0;i<A;i++) {
		int c =	Integer.parseInt(C[i]);
		 cnt+=c;
		}
		System.out.println(cnt);
	}

}
