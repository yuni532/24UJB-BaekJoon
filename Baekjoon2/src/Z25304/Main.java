package Z25304;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(); // 총 금액
		int N = sc.nextInt(); // 물건 갯수
		int A; // 물건금액
		int B; // 물건량
		int C = 0;
		int D = 0;

		for (int i=0;i<=N;i++) {
	
			 if (i<N){
	
				A = sc.nextInt();
				B = sc.nextInt();
				C = A * B;
				D += C;
				}
		}
		sc.close();
			 if (D!=X) {
				 System.out.println("No");	
					
				}else  {
			
					System.out.println("Yes");

			}
		}
}
	// 자꾸 런타임 에러뜸

	
	

//		while (int i=0;i<N;i++) {
//			if (D==X) {
//				System.out.println("Yes");
//				break;
//			}if (D>X) {
//			
//				System.out.println("No");	
//				break;
//		} if (D!=X){
//			
//			A = sc.nextInt();
//			B = sc.nextInt();
//			C = A * B;
//			D += C;
//
//			}
//	}
//		sc.close();
//}
//}