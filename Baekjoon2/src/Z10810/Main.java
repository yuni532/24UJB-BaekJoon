package Z10810;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt(); // 총 바구니의 수 
	int M = sc.nextInt(); // 공을 넣는 방법 수
	int[] arr = new int [N]		;//배열 수
	int z ;
	int	j ;
	int K ;
	
	
	for(int x=0;x<M;x++) {
		z = sc.nextInt(); 
		j = sc.nextInt();
		K = sc.nextInt();
		for (int i=z-1; i<=j-1;i++) { // i값안에 k를 j범위만큼 넣기+
		if (arr[i]>=0) {
			arr[i]=0;// 0으로 초기화 해야 값이 제대로 들어감
			arr[i]+=K;// 0으로 초기화한 값에 추가하기
		}
		
		}
	
	}
	sc.close();
	for(int c=0;c<arr.length;c++) { // arr[i]안에 있는 값 출력
		System.out.print(arr[c]+ " ");	
		}
		
	
	}

}
//성공