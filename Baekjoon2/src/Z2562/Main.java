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
		System.out.println(arr[arr.length-1]); // 최댓값 구하기
		System.out.println(arr.length-1); // 배열수 구하기
		sc.close();
	}

}
// 다시 처음부터 해야할듯 싶음
// array.list 사용이 맞는지 확인부터 해야함 사이즈 값 구하기 힘듦
// 배열로 하면 배열 값 지정이 어려움