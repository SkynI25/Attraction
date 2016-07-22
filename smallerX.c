#include <stdio.h>
#include <stdlib.h>

int main() {
	int N, x, num;
	int *parr;

	scanf("%d %d", &N, &x);

	parr = (int *)malloc(sizeof(int) * N);

	for (int i = 0; i < N; i++) {
		scanf("%d", &num);

		parr[i] = num;
	}

	for (int i = 0; i < N; i++) {
		if (parr[i] < x)
			printf("%d ", parr[i]);
	}
	return 0;
}