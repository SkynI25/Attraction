#include <stdio.h>

int main() {
	int a, b;

	scanf("%d", &a);

	for (int i = a; i <= 9; i++) {
		for (int j = 1; j <= 9; j++) {
			b = i * j;
			printf("%d * %d = %d\n", i, j, b);
		}
		break;
	}

	return 0;
}