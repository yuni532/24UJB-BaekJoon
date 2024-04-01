package Z2588;
	import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int A = sc.nextInt();
	String B= sc.next();
	sc.close();
	
	int C = A*(B.charAt(2)-'0');
	int D = A*(B.charAt(1)-'0');
	int E = A*(B.charAt(0)-'0');
	int F = D*10;
	int G= E*100;
	System.out.println(C);
	System.out.println(D);
	System.out.println(E);
	System.out.println(C+F+G);
	
	}
	}


//	import java.util.Scanner;
//	public class Main {
//	public static void main(String[] args) {
//	Scanner sc = new Scanner (System.in);
//	int A = sc.nextInt();
//	int B = sc.nextInt();
//	sc.close();
//	int n1 = B % 10;
//	System.out.println(A*n1);
//	int n2 = B / 10 % 10;
//	System.out.println(A*n2);
//	
//	int n3 =  B / 100;
//	System.out.println(A*n3);
//	System.out.println(A*B);
//	}
//	}
//	