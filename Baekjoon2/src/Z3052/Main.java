package Z3052;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int [10];
		int zxc; // ³ª´« °ª
		int [] sum = new int[10];
		int cnt = 0;
		for (int i =0; i<arr.length;i++) {
			int num = sc.nextInt();
			arr[i] = num;
			zxc =(arr[i]%42);
			sum[i] = zxc;
		}
		int[] newarr =Arrays.stream(sum).distinct().toArray();
		for(int i=0;i<newarr.length;i++) {
			cnt++;
		}
		System.out.println(cnt);
	}

}

//			if (sum[i] != zxc) {
//				cnt++;
//			}