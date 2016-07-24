#include <stdio.h>

// 사용자로부터 입력받는 수가 저장될 변수 a만 있어도 충분함.
// for 문은 조건이 되면 자동으로 탈출하기 때문에 break 문이 없어도 됨.

int main() {
	int a;

	scanf("%d", &a);

	for (int i = 1; i <= 9; i++) {
		printf("%d * %d = %d\n", a, i, a * i);
	}

	return 0;
}