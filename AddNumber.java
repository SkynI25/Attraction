import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// 조금 어려웠던 문제
		// 처음에 substring 으로 자릿수를 구분하여 풀이하려고 하였음
		// 새로운 수를 계속 더해줘야 하는 부분과 문자열로 입력받은 값을 비교하는 부분이 어려움이 있었음
		// 방법의 한계점을 발견하고 정보를 참고하였음
		int sum = 0;
		int x, y = 0;
		
		// / 연산과 % 연산을 통해 수의 각 자릿수를 구할 수 있었음
		// 문자열들을 새로 더하는 방법 외의 다른 방법
		x = N / 10;
		int xtmp = x;
		y = N % 10;
		int ytmp = y;
		// counts = 사이클 횟수
		int counts = 0;

		while (true) {
			// 각 자리수 더하기
			sum = xtmp + ytmp;
			// 주어진 수의 오른쪽 끝자리를 xtmp에 대입
			xtmp = ytmp;
			// 앞에서 구한 합의 가장 오른쪽 자리숫자 ytmp에 대입
			ytmp = sum % 10;
			counts++;
			if (xtmp == x && ytmp == y) {
				break;
			}
		}
		System.out.println(counts);
	}
}
