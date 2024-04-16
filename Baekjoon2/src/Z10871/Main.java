package Z10871;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();          // 배열에 들어갈 정수
		String [] A = new String[N];	// index 값 지정
		int X = sc.nextInt();
	
		int B;
		
		for(int i = 0;i<A.length;i++) {
			A[i] = sc.next();                    // 배열 내에 들어가는 수  	
		}
			for (int i =0; i<A.length;i++) {
				 B =Integer.parseInt(A[i]);
				if (B < X) {
			System.out.print(A[i]);
			System.out.print(" ");
				
			}
		
		
		}
		
			sc.close();
	}
}
