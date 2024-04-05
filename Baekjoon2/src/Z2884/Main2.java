package Z2884;
import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		
		if (M<60) {
			H--;
			M+=60;
		}
		M-=45;
		if (M>=60) {
		H+=1;
		M-=60;
		
		}
		if(H<0) {
			H=+23;
		}
		
		System.out.println(H+ " " + M);
		

	}

}
