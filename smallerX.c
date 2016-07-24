#include <stdio.h>

// 잘 생각해보면 동적할당(배열)없이도 구현할 수 있고, for문도 하나로 해결할 수 있음.
// 기존 구현이 나쁘다는 뜻이 아님! 동적할당으로 잘 구현했음 great!

// 기존에 동적할당은 없앰으로써 --> 메모리 효율성을 높혔고,
// for문을 하나로 줄임으로써 --> 2n의 시간복잡도를 n으로 줄임.

int main() {
	int N, x, num;

	scanf("%d %d", &N, &x);

	for (int i = 0; i < N; i++) {
		scanf("%d", &num);

		if (num < x)
			printf("%d ", num);
	}

	return 0;
}