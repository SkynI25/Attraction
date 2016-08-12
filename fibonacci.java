import java.util.Scanner;

public class fibonacci {
	public static int result[][];
	public static int fibonacci(int n,int i) {
		if (n == 0) {
			result[i][0] += 1;
			return 0;
		} else if (n == 1) {
			result[i][1] += 1;
			return 1;
		} else {
			return fibonacci(n - 1,i) + fibonacci(n - 2,i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = 0, number = 0;
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		result = new int[T][2];
		for (int i = 0; i < T; i++) {
			number = sc.nextInt();
			fibonacci(number,i);
		}
		for (int j=0; j < result.length; j++) {
			System.out.println(result[j][0] + " " + result[j][1]);
		}
	}
}
