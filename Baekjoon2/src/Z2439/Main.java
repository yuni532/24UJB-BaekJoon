package Z2439;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		
		for (int i=0; i<N;i++) { // ��
			for(int j=N-i-1; j>0;j--) {//�࿡�� ��ĭ�� ä�� 
				System.out.print(" ");
			}
			for (int k=0; k<=i;k++) {//�࿡�� *�� ä��
				System.out.print("*");
			}
			System.out.println(" ");
		}
	
	}

}
// ���� ���� �ؾߴ�
//import java.util.Scanner;
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		sc.close();
//		
//		
//		for (int i=0; N>i;i++) {
//			
//			for(int j=N; j>i;j--) {
//				System.out.printf("%s","*");
//			}
//			System.out.println("");
//			
//		}
//	}
//
//}
//
//*****
//****
//***
//**
//*

