package Z2742;
	import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int n= 1;
		sc.close();
		while(n<=num) {
			System.out.println(num--);
		}
	}

}
