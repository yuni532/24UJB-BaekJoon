package Z10952;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//int T = sc.nextInt();
	int A ;
	int B ;
	int C ;
	for (int i = 1;i<1000;i++) {
		 A = sc.nextInt();
		 B = sc.nextInt();
		 C = A+B;
		 if(B<10) {
		 if (A<=0) {
			 break;
				
			}
		 }

		System.out.println(C);
	}
	sc.close();

	}

}
