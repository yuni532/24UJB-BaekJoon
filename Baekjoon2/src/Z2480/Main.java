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
		}else if (A==B&&B!=C) { //A�� B�� ���� C�� �ٸ���
			System.out.println(1000+(A*100));
			break;
		}else if (A!=B&&B==C) { //B�� C�� ���� A�� �ٸ���
			System.out.println(1000+(B*100));
			break;
		}else if (A==C&&B!=C) { //A�� C�� ���� B�� �ٸ���
			System.out.println(1000+(A*100));
			break;
		}else if (A>B&&A>C) { //A�� B,C���� Ŭ��
			max= A;
			System.out.print(max*100);
			break;
		}else if (B>A&&B>C) { //B�� A,C���� Ŭ��
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
