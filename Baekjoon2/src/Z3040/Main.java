package Z3040;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[9];

		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();

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
						break;
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

