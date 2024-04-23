package Z2562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int [9];
		int A =0;
		int max = 0;
		for (int i=0; i<arr.length; i++) {
			arr[i] =sc.nextInt();
		if(arr[i]>max) {
			max=arr[i];
		}
		}
		for (int i=0; i<arr.length; i++) {
		if(max== arr[i]) {
			A=i;
		}
		}
		System.out.println(max); // �ִ� ���ϱ�
		System.out.println(A+1); // �迭�� ���ϱ�
		sc.close();
	}

}
