#include <stdio.h>

int main() {
	int num1, num2, num3, max1 = 0, max2 = 0, tmp;
	int arr[3];

	scanf("%d %d %d", &num1, &num2, &num3);

	arr[0] = num1;
	arr[1] = num2;
	arr[2] = num3;

	for (int i = 0; i < 3; i++) {
		if (arr[0] > arr[1]) {
			tmp = arr[0];
			arr[0] = arr[1];
			arr[1] = tmp;
			if (arr[1] > arr[2]) {
				tmp = arr[1];
				arr[1] = arr[2];
				arr[2] = tmp;
			}
		}
		else if (arr[0] > arr[2]) {
			tmp = arr[0];
			arr[0] = arr[2];
			arr[2] = tmp;
			if (arr[1] > arr[2]) {
				tmp = arr[1];
				arr[1] = arr[2];
				arr[2] = tmp;
			}
		}
	}
	for (int i = 0; i<3; i++) {
		if (arr[i] >= max1) {
			max2 = max1;
			max1 = arr[i];
		}
		else if ((arr[i] > max2 && arr[i] < max1) || max1 == max2) {
			max2 = arr[i];
		}
	}
	printf("%d", max2);
	return 0;
}