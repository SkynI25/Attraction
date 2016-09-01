import java.util.Scanner;

public class fibonacci_ {
	public static int zero = 0, one = 0;

	public static int fibo(int n) {
		if (n == 0) {
			zero++;
			return 0;
		} else if (n == 1) {
			one++;
			return 1;
		} else
			return fibo(n - 1) + fibo(n - 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number, T;
		T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			number = sc.nextInt();
			fibo(number);
			System.out.println(zero + " " + one);
			one = 0;
			zero = 0;
		}

	}

}
