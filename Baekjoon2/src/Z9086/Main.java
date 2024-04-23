package Z9086;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		int T = sc.nextInt();
		String A ;
		String[] Strings ;
		for(int i =0; i<T; i++) {
			A = sc.next();
			for(int j=0;j<A.length();j++) {
			if (j ==A.length()) {
				System.out.print(arr.get(0));
				System.out.println(arr.get(j));
			}else {
				Strings =A.split("");
				arr.add(Strings[j]);
	
				
			}
			}
		}
		
	}

}

// 디버그 해보고 확인하기 답 이상함