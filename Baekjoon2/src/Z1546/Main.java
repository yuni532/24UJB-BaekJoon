package Z1546;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] arr = new double [N];
		double max =0;//최대값 넣을곳
		double[] sum =new double [N];//나눈값 다 넣을곳
		double pum =0; // 나눈값들 더한 곳
		for(int i=0;i<N;i++) {
		double num = sc.nextInt();
			arr[i] = num;
		if (max<num) { // 최댓값 구함
			max=num;
		}
		}
		for (int j=0;j<N;j++) {
			sum[j] =((arr[j]/max)*100);
			pum+= (sum[j]/N);
		}
		System.out.print(pum);
	}

}
