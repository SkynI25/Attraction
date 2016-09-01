import java.util.Arrays;
import java.util.Scanner;

public class Coin_11047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/**
		 * 개인 취향 차이기는 하지만, 나는 변수 선언 후 초기화를 더 좋아해 ㅎㅎㅎ
		 * 왜냐하면, 그게 더 보기가 좋고 이해하기 쉬운 것 같아.
		 * 
		 * 사용하는 변수들을 초기에 선언하면 '이 함수 내에서는 이런 변수들이 쓰이겠구나' 하고 찾기도 쉬워.
		 * 하지만 중간에 선언되어 있으면 변수가 어디에 선언 되어있는지 찾기가 조금 어려운 것 같아.
		 */
		int N, K;
		int coin[];
		int count;
		
		N = sc.nextInt();
		K = sc.nextInt();
		coin = new int[N];
		count = 0;

		
		/**
		 * 그리고 기존 코드를 보면 (N - 1)부터 시작하여 j >= 0 동안 N개의 숫자를 입력 받는 데
		 * 이것도 나쁘지 않아 하지만 일반적으로 0부터 시작하여 N번 반복하는 패턴이 좀 더 직관적인 것 같아.
		 * 아마 동전 숫자가 오름차순이라서 이렇게 한 것 같은데, 암튼 이 문제는 이거 다음 for문에서 이야기 할께 
		 */
		for (int i = 0; i < N; i++) {
			coin[i] = sc.nextInt();
		}
		
		
		/**
		 * 여기서 (N - 1)부터 시작하여 거꾸로 읽어들여 ㅎㅎㅎ
		 * 이게 뭔가 조금 더 논리적인 흐름같아서 이렇게 했고,
		 * sort 함수(자바에 내장 되어있어)를 사용하면 0부터 시작하여 N번까지 할수 있는데
		 * 논리적인 흐름상 이게 더 나은 거 같아서 이렇게 했어~
		 */
		for(int i = N - 1; i > 0; i--) {
			if(K < coin[i]) {
				count += K / coin[i];
				
				K -= coin[i] * (K / coin[i]);
			}
		}
		
		
		System.out.println(count);
	}
}