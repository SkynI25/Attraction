#include <stdio.h>

int main() {

	int star, i, j;

	scanf("%d", &star);
	for (i = 0; i < star; i++) {
		for (j = 0; j < star; j++) {
			if (j < star - 1 - i) {
				printf(" ");
			}
			else {
				printf("*");
			}
		}
		printf("\n");
	}
	getchar();

	return 0;
}