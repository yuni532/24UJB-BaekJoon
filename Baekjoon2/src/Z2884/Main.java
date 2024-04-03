package Z2884;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
	

		if (0 < M && M <= 59) {
			if (0<H&&H <= 23) {
					if ((M - 45) < 0) {
					H--;
					M += 60;
					System.out.print(H + " ");
					System.out.println(M - 45);					
				} 
			}
			if (H<=0) {
					H--;
					M += 60;
					System.out.print((H+24) + " ");
					System.out.print(M - 45);	
				}
			if (M==60) {
				H++;
				M += 60;
				System.out.print((H+24) + " ");
				System.out.print(M - 45);	
			}



				}
			}
		}
	


//0 30 입력시 -1 45 가 아닌 23 45가 되게 해야함