package Z10813;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt(); // 총 바구니의 수 
	int M = sc.nextInt(); // 공을 넣는 방법 수
	int[] arr = new int [N]		;//배열 수
	int l; // 바꿀 바구니 1번
	int k; // 바꿀 바구니 2번
	int[] sub = new int[1]; // 잠깐 값을 넣어둘 배열
	
	
		for (int i=0; i<arr.length;i++) { // 배열 안에 1,2,3,4,5 넣기  
			for (int j=1; j<=arr.length;j++) { //i가 idx값
			arr[i++]+=j;					   //j가 입력값
			}
		}
		
//		for (int i=0;i<M;i++) {	// 바꿀 바구니 값 입력받기
		for(int j=0;j<M;j++) {
			l=sc.nextInt(); 
			k=sc.nextInt();
			sub[0]=arr[l-1];
			arr[l-1]=arr[k-1];
			arr[k-1]=sub[0];
	//	}
		}
	sc.close();
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+ " ");		// 배열 안에 1,2,3,4,5 넣기 
		}
	
	
	}

}


	

