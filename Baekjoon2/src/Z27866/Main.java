package Z27866;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	ArrayList<String> arr = new ArrayList<>();
	String s = sc.next();
	String[] Strings ;
	int a = sc.nextInt();	
	for(int i=0;i<a;i++) {
		Strings =s.split("");
		arr.add(Strings[i]);
	
	}

	System.out.print(arr.get(a-1));
	}

}
