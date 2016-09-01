import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int minimum = 0;
		int N = s.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = s.nextInt();
		}
		
		Arrays.sort(arr);
		
		for (int j=0; j<N; j++) {
			for(int k=0; k<j+1; k++) {
				minimum += arr[k];
			}
		}
		System.out.println(minimum);
	}
}
