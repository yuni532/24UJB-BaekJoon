package Z3040;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[9]; // 배열 칸수 지정 

		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt(); // 범위 값 지정 및 입력값
		}
		sc.close(); // 스캐너 닫기

		for (int i = 0; i < A.length; i++) {

		}
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
		}
		// 합계에서 제외할 2개의 수 선정
		int ai = -1, aj = -1;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (i != j) {
					if ((sum - (A[i] + A[j]) == 100)) {
						ai = i;
						aj = j;
						break; // i와 j가 동일 수가 나오지 않게 하기 위해 i != j를 입력함
					}
				}
			}

		}
		for (int k = 0; k < A.length; k++) {
			if (k != ai && k != aj)
				System.out.println(A[k]);
		}

	}
}

