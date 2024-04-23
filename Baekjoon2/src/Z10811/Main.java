package Z10811;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // �� �ٱ����� �� 
		int M = sc.nextInt(); // M�� �ٲ� �� 
		int[] arr = new int[N];
		int l ;
		int k ;
		int t ;
		for (int i = 0; i<arr.length; i++) {
				arr[i]=i+1;
		}
		int[] newar = Arrays.copyOf(arr,arr.length);

	
			
		for(int j=0;j<M;j++) {
			l = sc.nextInt()-1;
			k = sc.nextInt()-1;
			t= (k-l);

			if((l+1)>=k) {
			arr[l] = newar[k];
			arr[k] = newar[l];
			}else {
				for (int i=0; i<=t;i++) {
//				if (M==1) {
//				M=2;
				if (k>=0) {
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
// 1	2	3	4	5 �����					
// �迭 �����ѵ� 
//	l�̶� j �� ����ϰ� �ٽ� j���� l���� �� ������ �Է��ϱ�
//	�̰� M������ �� �Ǹ� ��� 
//
//
//
//
//
//

