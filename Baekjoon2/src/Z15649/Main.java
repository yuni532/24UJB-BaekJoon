package Z15649;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N  = sc.nextInt(); 
		int M = sc.nextInt();
		int cnt =1;
		int[] arr = new int [N];
		
		
		for(int i =0; i<N;i++) {
			arr[i] = cnt;
			cnt++;
			}
		for(int i =0; i<N;i++) {
			cnt=0;
			for(int j=0;j<M;j++) {
				
					if(arr[i] == arr[j]) {
						
				System.out.print( arr[i]+" ");
					}else if (arr[i] != arr[j]) {
						cnt++;
						System.out.print(arr[cnt]+ " ");
					}
				
		
			}
			System.out.println();
		}
		
		
		
	}

}
