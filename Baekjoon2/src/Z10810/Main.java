package Z10810;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt(); // �� �ٱ����� �� 
	int M = sc.nextInt(); // ���� �ִ� ��� ��
	int[] arr = new int [N]		;//�迭 ��
	int z ;
	int	j ;
	int K ;
	
	
	for(int x=0;x<M;x++) {
		z = sc.nextInt(); 
		j = sc.nextInt();
		K = sc.nextInt();
		for (int i=z-1; i<=j-1;i++) { // i���ȿ� k�� j������ŭ �ֱ�+
		if (arr[i]>=0) {
			arr[i]=0;// 0���� �ʱ�ȭ �ؾ� ���� ����� ��
			arr[i]+=K;// 0���� �ʱ�ȭ�� ���� �߰��ϱ�
		}
		
		}
	
	}
	sc.close();
	for(int c=0;c<arr.length;c++) { // arr[i]�ȿ� �ִ� �� ���
		System.out.print(arr[c]+ " ");	
		}
		
	
	}

}
//����