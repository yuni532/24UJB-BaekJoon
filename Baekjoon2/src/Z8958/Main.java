package Z8958;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int X = sc.nextInt();


		for (int i=0;i<X;i++) {
			int num=0;
			int cnt=1;
			String A = sc.next();
			
		for (int j=0;j<A.length();j++) {
			if(A.charAt(j)=='O') {
		
				num+=cnt++;
			} else {
				cnt=1;
			}
				
			}
		System.out.println(num);
		}
		
		sc.close();
	}

}

//		for(int i=0;i<arr.size();i++) {
//			
//		
//	cnt++;
// num+=cnt;