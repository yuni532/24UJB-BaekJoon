package Z10818;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int [N];
		
		for (int i = 0; i < N;i++) {
			arr[i]=sc.nextInt();
		
		}
		sc.close();
		Arrays.sort(arr);
		System.out.print(arr[0]+ " ");
		
		
		
		Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		Arrays.sort(arr2, Collections.reverseOrder());
		System.out.print(arr2[0]);

		
		
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		for (int i=0; i<A.length;i++) {
//			A[i] = sc.nextInt();
//		}
//		for (int j=0; j<A.length;j++) {
//		if (A[j]>A[j+1]) {
//			if(A[j]>A[j+2]) {
//				if(A[j]>A[j+3]) {
//					if(A[j]>A[j+4]) {
//						System.out.print(A);
//					}
//				}
//			}
//	
//		}
//			
//		
//		}
//			
//	
//		
//	for (int j=0; j<A.length;j++) {
//			if(true) {
//		 E = Math.min(A[j],A[j++]);
//			
//		}
//			System.out.println(E);
//			
//				
//			
//	
//	}
//	//	System.out.print(C);
//	//	break;
//}
//}
//
//
//
