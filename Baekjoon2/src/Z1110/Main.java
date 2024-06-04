package Z1110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int A = sc.nextInt();

	int a = A;
	int cnt = 0;

	for (;;) {	
		cnt++;
        a= (10*(a%10))+(((a/10)+(a%10))%10);
	if(a==A) {
		break;
	}
	}
	System.out.print(cnt);
	}

}
