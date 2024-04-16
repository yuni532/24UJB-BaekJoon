package Z10828;

import java.util.Stack;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		
		int N = sc.nextInt();
		for (int i=0; i<N;i++) {
			String cmd = sc.next();
		
			switch(cmd) {
			case "push":
		
				int param = sc.nextInt();
				System.out.println(param);
				stack.push(param);
				break;
			case "pop":

				if(stack.empty()) {
					System.out.println("-1");
				}else { 
				int ret = stack.pop();
					System.out.println(ret);
				}
				break;
			case "size":
			//	System.out.println("size");
				stack.size();
				System.out.println(stack.size());
				break;
			case "empty":
				//System.out.println("empty");
				if(stack.empty()) {
					System.out.println(1);
				} else {
						System.out.println(0);
			
				}
				break;
				
			case "top": {
				//System.out.println("top");
				
				if (stack.empty()) {
					System.out.println(-1);
			} else {
	
					System.out.println(stack.peek());
			
			}

				break;
	
	}
			
		}
		
		sc.close();
		
		
		
	}
}
}
