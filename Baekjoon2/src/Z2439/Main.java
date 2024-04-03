package Z2439;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		
		for (int i=0; i<N;i++) { // 열
			for(int j=N-i-1; j>0;j--) {//행에서 빈칸을 채움 
				System.out.print(" ");
			}
			for (int k=0; k<=i;k++) {//행에서 *을 채움
				System.out.print("*");
			}
			System.out.println(" ");
		}
	
	}

}
// 우측 정렬 해야댐
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

