package Z2562;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int [9];
		
		for (int i=0; i<arr.length; i++) {
		if(arr[i]<100) {
			arr[i] =sc.nextInt();
		}
		}
		Arrays.sort(arr);
		for (int i=0; i<arr.length; i++) {

		}
		System.out.println(arr[arr.length-1]); // �ִ� ���ϱ�
		System.out.println(arr.length-1); // �迭�� ���ϱ�
		sc.close();
	}

}
// �ٽ� ó������ �ؾ��ҵ� ����
// array.list ����� �´��� Ȯ�κ��� �ؾ��� ������ �� ���ϱ� ����
// �迭�� �ϸ� �迭 �� ������ �����