package Z1330;
	import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int num1 = sc.nextInt();
	sc.close();
	
	for (;;) {
		if (num<num1) {
			System.out.println("<");
			break;
		}else if (num>num1) {
		System.out.println(">");
		break;
		}else if (num==num1) {
			System.out.println("==");
			break;
		}
	}
	}

}
