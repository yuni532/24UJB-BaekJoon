package Z5597;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A ; // �迭�� �� �� 
		int[] arr = new int [31]; // 30���� �ϸ� index �ӽñ� �� �迭 ����
		for (int i =1; i<29;i++) {
			A=sc.nextInt(); // �ֱ� 
			arr[A]+=1;// �Էµ� �迭�� 1 �Է�
		//	System.out.println(arr[i]);
		}
			
				
			for (int j=1; j<arr.length;j++) {
				if (arr[j]==1) { // A �� ���� 1�� ������ �Ѿ�� 
			}else if(arr[j]!=1) { // A�� ���� 1�� ������ �� �� ���
				System.out.println(j);
			}
		
		}
		
	}

}

//30����  28�� �ְ� 
//30���� ���ؼ� �ְ� ���� ������
//������ ����ϸ� �ȴ�
//���� �� �����Ǿ��ְ� 
//�׷��� �迭 ���� �־ 
//�迭 ���ڿ� �ִ��� �������� �Ǵ��ϸ� �ȴ� ������
