package Z18870;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
	
		int N= sc.nextInt();
		int[] arr = new int[N];
		int cnt=0;
		int[] newarr = new int [N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] newnum = Arrays.copyOf(arr,arr.length);
		
		for (int i=0; i<arr.length;i++) {
			ass:
			for (int j=0;j<arr.length;j++) {
				cnt=0;
				if (arr[i]==newnum[j])  {
					newarr[i]+=cnt;
					continue ass;
				}
				if(arr[i]>newnum[j]) {
					cnt++;
					newarr[i]+=cnt;
				
				}	
				 
				
			}
			System.out.print(newarr[i] + " ");
		}
	}

}
