package Z8393;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int A = sc.nextInt();
		sc.close();
		int sum = 0;
		int num=0;
		for (int i=0;i<A;i++) {
			num++;
			sum+=num;
		}
		System.out.print(sum);
	}

}
