package Z1193;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int X = sc.nextInt();
//		String[] str = new String[X];
		int [][] arr = new int [X][X];
		int rv=1;         
		int lv =1;		
		
//		for(int i=1;i<=X;i++) {
//				rv+=i; 
//			for(int j=1;j<X;j++) {
//			if (rv>1) {
//				rv-=i;
//				lv+=j;	
//			}else if (rv==1) {
//				lv++;
//			}else if(lv>1) {
//				lv-=i;
//				rv+=j;
//			}else	if (lv==1) {
//				rv++;
//			}
//			
//			}
//		}
//		System.out.print(lv+ " / "+rv);
//		
//		
		for (int i=0;i<X;i++) {
			for (int j =0;j<X;j++) {
				
				rv++;
				lv++;
				arr[i][j] = lv;
				arr[j][i] = rv;
				if(rv>X) {
					rv=1;
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		
		
	
		
		
		
		
		
	}

}

//		
//		for (int i=0;i<X;i++) {
//			sum+=(i+1); // ���� Ŀ���� �� 
//			System.out.println(sum);
//		}
//		
//		for(int i=1;i<str.length;i++) { // ����  Ŀ���� ��
//			num+=(i+1);
//			System.out.println(num);
//		}