package Z1193;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int X = sc.nextInt();
//		String[] str = new String[X];
		
		int rv=1;          // ���� �� ���� ĭ�� ����
		int lv =1;			// ���� ���� ĭ 
		
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
//			sum+=(i+1); // ���� Ŀ���� �� 
//			System.out.println(sum);
//		}
//		
//		for(int i=1;i<str.length;i++) { // ����  Ŀ���� ��
//			num+=(i+1);
//			System.out.println(num);
//		}