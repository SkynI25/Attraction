#include <stdio.h>

// *룩업테이블 (!)
// 일단 짜보는 거야 --> 효율성 따지지 말고, 일단 동작하는 코드
// --> 좀더 효율적인 방법을 생각보자..
// --> 코드를 효율적으로 진화시켜간다.
// --> 코드들의 패턴이 거의 비슷해져..
// 이러한 과정을 계속 연습을 하고 다른 사람코드도 리뷰를 하다보면..
// 자연스럽게 몸에 익게된다..★

int main() {

	int month, day, count = 0;
	
	// 해당 달의 날짜의 갯수
	int daysOfMonth[] = { -1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	char* week[] = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };

	/*
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
	*/

	scanf_s("%d %d", &month, &day);

	/*
	month -= 1;
	day -= 1;
	*/

	/*
		3월 27일
		1월 => +31일
		2월 => +28일
		3월 => +27일
		---------------
		누적된 날짜: 86일 % 7 ==> 요일
			--> 바로 직전 달의 날짜 갯수를 누적..
			--> 해당 월에는 자신의 날짜를 더함
	*/

	// 2007년 1월 1일로'부터' 직전 달까지의 누적된 날짜 수를 구함
	for (int i = 1; i < month; i++)
		count += daysOfMonth[i];
	count += day - 1;

	printf("%s", week[count % 7]);
	/*
	switch (arr[month][day] % 7) {
	case 0: printf("MON\n"); break;
	case 1: printf("TUE\n"); break;
	case 2: printf("WED\n"); break;
	case 3: printf("THU\n"); break;
	case 4: printf("FRI\n"); break;
	case 5: printf("SAT\n"); break;
	case 6: printf("SUN\n"); break;
	}*/

	getchar();
	return 0;
}