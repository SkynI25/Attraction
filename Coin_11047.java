import java.util.Arrays;
import java.util.Scanner;

public class Coin_11047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, K, count = 0, f = 0, i = 0;
		N = sc.nextInt();
		K = sc.nextInt();
		int coin[] = new int[N];

		for (int j = N - 1; j >= 0; j--) {
			coin[j] = sc.nextInt();
		}

		// 문제해결을 위한 코드작성은 금방했지만 런타임에러를 해결하기 위해 시간을 소비한 문제.
		// 여기저기 코드를 수정해보며 어디가 문제인지 확인해보니 다른 질문 중에
		// i값이 while문을 돌 때 -1 또는 N값을 초과하는 경우가 있다고 해서 while 문의 범위를 정해주고 제출하니 맞았다고
		// 떴다.
		// 처음에 배열이 N값의 범위인 1<= N <= 10 에 맞춰야하는줄 알고 범위를 맞추기 위해 이리저리 시도해보았지만
		// 배열범위를 수정하는게 너무 어려워서 포기하고 while문만 수정하고 제출했는데 맞았다고 떳다.
		// 결국 배열 범위와 N의 범위는 아무런 상관이 없었던 것.
		// 문제와 상관없는 것에 시간을 허비한 것 같아 허무했다. 하지만 덕분에 매번 어려움을 겪던 배열에 대해 많은 시간
		// 투자하여 배울 수 있었다. 다음부턴 배열범위에 대해서 헤매지 말자
		// 그리고 문제를 통해 for문과 while문에 대한 이해가 좀 더 필요하다는 것을 느꼈다.

		while (i >= 0 && i < N) {
			if (coin[i] > K) {
				i++;
			} else if (coin[i] < K) {
				K -= coin[i];
				count++;
			} else {
				f = 1;
				count++;
				break;
			}
		}

		if (f == 1)
			System.out.println(count);
		else {
			System.out.println("숫자가 잘못 입력되었습니다");
		}
	}
}
