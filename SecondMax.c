#include <stdio.h>

// 이 문제는 if문 사용법에 대한 문제다.
// 숫자 여러 개중에 2번째로 큰 수를 고르는 거라면,
// 반복문이나 정렬 알고리즘을 생각해볼 수 있는데
// 고작 3개의 수 중에서 2번째로 큰 수를 고르는 것이므로
// 조건문 몇개로 간단히 판별이 가능하다.

int main() {
	int tmp = 0;
	int arr[3];

	scanf("%d %d %d", &arr[0], &arr[1], &arr[2]);

	if ((arr[0] >= arr[1] && arr[1] >= arr[2] && arr[0] >= arr[2])
		|| (arr[0] <= arr[1] && arr[1] <= arr[2] && arr[0] <= arr[2]))
		tmp = 1;
	else if ((arr[0] <= arr[1] && arr[1] >= arr[2] && arr[0] <= arr[2])
		|| (arr[0] >= arr[1] && arr[1] <= arr[2] && arr[0] >= arr[2]))
		tmp = 2;
	else
		tmp = 0;

	printf("%d", arr[tmp]);
	return 0;
}