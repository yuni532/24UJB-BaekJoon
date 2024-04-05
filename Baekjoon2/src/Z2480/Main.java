package Z2480;
 import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int max;
		sc.close();
		
		for(;;) {
		if (A==B&&B==C) {
			System.out.println(10000+(A*1000));
			break;
		}else if (A==B&&B!=C) { //A와 B는 같고 C는 다를때
			System.out.println(1000+(A*100));
			break;
		}else if (A!=B&&B==C) { //B와 C는 같고 A는 다를때
			System.out.println(1000+(B*100));
			break;
		}else if (A==C&&B!=C) { //A와 C는 같고 B는 다를때
			System.out.println(1000+(A*100));
			break;
		}else if (A>B&&A>C) { //A가 B,C보다 클때
			max= A;
			System.out.print(max*100);
			break;
		}else if (B>A&&B>C) { //B가 A,C보다 클때
			max= B;
			System.out.print(max*100);
			break;
		} else if (C>B&&C>A){
			max = C;
			System.out.print(max*100);
			break;
		}
		}
		
		
	}

}
