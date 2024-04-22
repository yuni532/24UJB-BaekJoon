package Z5597;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A ; // 배열에 들어갈 값 
		int[] arr = new int [31]; // 30으로 하면 index 머시기 뜸 배열 지정
		for (int i =1; i<29;i++) {
			A=sc.nextInt(); // 넣기 
			arr[A]+=1;// 입력된 배열에 1 입력
		//	System.out.println(arr[i]);
		}
			
				
			for (int j=1; j<arr.length;j++) {
				if (arr[j]==1) { // A 번 수에 1이 있으면 넘어가고 
			}else if(arr[j]!=1) { // A번 수에 1이 없으면 그 값 출력
				System.out.println(j);
			}
		
		}
		
	}

}

//30개에  28개 넣고 
//30개랑 비교해서 있고 없고 따져서
//없으면 출력하면 된다
//범위 값 지정되어있고 
//그러면 배열 값에 넣어서 
//배열 숫자에 있는지 없는지로 판단하면 된다 같은데
