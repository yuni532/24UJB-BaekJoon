package Z10039;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int cnt = 0;
	
	for( int i=0; i<5;i++) {
		int A= sc.nextInt();
		
		if(A<40) {
			A =40;
		cnt+= A;
		}else {
			cnt+=A;
		}
		
	}
	System.out.println(cnt/5);

	}

}
