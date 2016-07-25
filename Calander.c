#include <stdio.h>

int main() {

	int arr[12][365];

	int month, day, index=0, chgindex=0, i=0, j=0;

	for (i = 0; i < 12; i++) {
		if (i == 0 || i == 2 || i == 4 || i == 6 || i == 7 || i == 9 || i == 11) {
			for (j = 0; j < 31; j++) {
				if (j != 30) {
					arr[i][j] = index % 7;
					index++;
				}
				else if (j == 30 && i == 0) {
					arr[i][j] = index % 7;
					index = (chgindex + 3) % 7;
				}
				else {
					arr[i][j] = index % 7;
					index++;
					//chgindex += 3;
					//index = (chgindex + 3) % 7;
				}
			}
		}
		else if (i == 3 || i == 5 || i == 8 || i == 10) {
			for (j = 0; j < 30; j++) {
				if (j != 29) {
					arr[i][j] = index % 7;
					index++;
				}
				else {
					arr[i][j] = index % 7;
					index++;
					//index = (chgindex + 2) % 7;
				}
			}
		}
		else {
			for (j = 0; j < 28; j++) {
					arr[i][j] = index % 7;
					index++;
					if (j == 27) {
						index = 3;
					}
			}
		}
	}

	scanf_s("%d %d", &month, &day);

	month -= 1;
	day -= 1;

	switch (arr[month][day] % 7) {
	case 0: printf("MON\n"); break;
	case 1: printf("TUE\n"); break;
	case 2: printf("WED\n"); break;
	case 3: printf("THU\n"); break;
	case 4: printf("FRI\n"); break;
	case 5: printf("SAT\n"); break;
	case 6: printf("SUN\n"); break;
	}

	getchar();
	return 0;
}