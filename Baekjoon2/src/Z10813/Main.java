package Z10813;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt(); // �� �ٱ����� �� 
	int M = sc.nextInt(); // ���� �ִ� ��� ��
	int[] arr = new int [N]		;//�迭 ��
	int l; // �ٲ� �ٱ��� 1��
	int k; // �ٲ� �ٱ��� 2��
	int[] sub = new int[1]; // ��� ���� �־�� �迭
	
	
		for (int i=0; i<arr.length;i++) { // �迭 �ȿ� 1,2,3,4,5 �ֱ�  
			for (int j=1; j<=arr.length;j++) { //i�� idx��
			arr[i++]+=j;					   //j�� �Է°�
			}
		}
		
//		for (int i=0;i<M;i++) {	// �ٲ� �ٱ��� �� �Է¹ޱ�
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
		System.out.print(arr[i]+ " ");		// �迭 �ȿ� 1,2,3,4,5 �ֱ� 
		}
	
	
	}

}


	

