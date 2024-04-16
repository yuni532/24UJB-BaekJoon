package Z1193;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int X = sc.nextInt();
//		String[] str = new String[X];
		
		int rv=1;          // 제일 윗 가로 칸의 숫자
		int lv =1;			// 왼쪽 세로 칸 
		
		for(int i=1;i<=X;i++) {
				rv+=i; 
			for(int j=1;j<X;j++) {
			if (rv>1) {
				rv-=i;
				lv+=j;	
			}else if (rv==1) {
				lv++;
			}else if(lv>1) {
				lv-=i;
				rv+=j;
			}else	if (lv==1) {
				rv++;
			}
			
			}
		}
		System.out.print(lv+ " / "+rv);
		
		
		
		
		
		
	
		
		
		
		
		
	}

}

//		
//		for (int i=0;i<X;i++) {
//			sum+=(i+1); // 가로 커지는 값 
//			System.out.println(sum);
//		}
//		
//		for(int i=1;i<str.length;i++) { // 세로  커지는 값
//			num+=(i+1);
//			System.out.println(num);
//		}