package Z2753;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = (A % 4);
//		double C = (A % 100);		double D = (A % 400);
		sc.close();
//		for (;;) {
//			if ( C==0 && D==0) {
//				System.out.println("1");
//					break;
//			}else if ((C!=0)&&(D==0)){
//				System.out.println("0");
//				break;
//			}else if (B==0) {
//				System.out.println("1");
//				break;
//			}else {
//				System.out.println("0");
//				break;
//			}
//		}
//	
		System.out.println(B);
	}
}


