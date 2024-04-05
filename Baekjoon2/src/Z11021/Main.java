package Z11021;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	int A ;
	int B ;
	for (int i = 1;i<=T;i++) {
		 A = sc.nextInt();
		 B = sc.nextInt();
		System.out.print("Case #");
		System.out.print(i+": ");
		System.out.println(A+B);
	}
	sc.close();

	}

}
