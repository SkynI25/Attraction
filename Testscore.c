#include <stdio.h>

// 기존 코드도 괜찮음!
// 조건문의 if, else if, else 를 잘 이용하면 불필요한 부분을 없앨 수 있음
// [if]..[else if]..[else]는 앞의 조건들이 만족하지 않으면 아래로 차례대로 실행됨.
// 그래서 조건을 간략화 시킨수 있음 :)

int main() {
	int score;

	scanf("%d", &score);

	if (score >= 90) {
		printf("A\n");
	}
	else if (score >= 80) {
		printf("B\n");
	}
	else if (score >= 70) {
		printf("C\n");
	}
	else if (score >= 60) {
		printf("D\n");
	}
	else {
		printf("F\n");
	}

	return 0;
}
