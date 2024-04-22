package Z10811;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 총 바구니의 수 
		int M = sc.nextInt(); // M번 바꿀 수 
		int[] arr = new int[N];
		int l ;
		int k ;
		for (int i = 0; i<arr.length; i++) {
				arr[i]=i+1;
		}
		int[] newar = Arrays.copyOf(arr,arr.length);

	
			
		for(int j=0;j<M;j++) {
			l = sc.nextInt()-1;
			k = sc.nextInt()-1;

			if((l+1)>=k) {
			arr[l] = newar[k];
			arr[k] = newar[l];
			}else {
				for (int i=0; i<M;i++) {
				if (M==1) {
				M=2;
				} else	if (k>=0) {
					newar[l]=arr[k];
				l++;
				k--;
				}
					}
			
				}
				}
			
		for(int i=0;i<N;i++) {	
		System.out.print(newar[i] +" ");
		}
		}
	}



//1	 2	3	4	5
//2	 1	3	4	5
//2	 1	4	3	5
//3	 4	1	2	5
//3	 4	1	2	5
// 1	2	3	4	5 만들고					
// 배열 복사한뒤 
//	l이랑 j 다 출력하고 다시 j부터 l까지 빈 공간에 입력하기
//	이거 M값까지 다 되면 출력 
//
//
//
//
//
//

