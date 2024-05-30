package Z2720;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt(); // testcase 값
		int mon, Qua, Di, Ni, Pe, qua, di, ni, pe, d, c, e, f; 

		Qua = 25;
		Di = 10;
		Ni = 5;
		Pe = 1;

		for (int i = 0; i < tc; i++) {
			mon = sc.nextInt();
			qua = 0;
			di = 0;
			ni = 0;
			pe = 0;
			d = mon % Qua;
			c = d % Di;
			e = c % Ni;
			f = e / Pe;
			if (d >= 0) {
				qua = mon / Qua;
				if (c >= 0) {
					di = d / Di;
					if (e >= 0) {
						ni = c / Ni;
						if (f >= 0) {
							pe = e / Pe;
						}
					}

				}
			}

			System.out.println(qua + " " + di + " " + ni + " " + pe);

		}
		sc.close();
	}

}
