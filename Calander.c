#include <stdio.h>

// 기존의 코드에서 단축시킬 수 있는 여지가 굉장히 많아.
// 일단 arr[12][365] 이렇게 (12 * 365)개의 원소를 만들었는데, 낭비되는 공간이 많아.
// arr[12][31] 이게 더 적절한 적절할 것 같아. 최대 (12 * 31) 개만 사용하기 때문이야.
//
// 그리고 기존 코드에서 1월부터 12월까지 '모든' 요일을 arr[12][365]에다가 미리 구하는 데,
// 이 문제에서는 전체를 구하기 보다는 필요한 것만 구하는 것이 효율적일 것 같아.
//
// 또한 월에 해당하는 수를 더할 때, 아래의 daysOfMonth 처럼
// 룩업(lookup)테이블을 이용하면 훨씬 편하게 사용할 수 있어.
//
// 마찬가지로 요일을 기존에는 switch..case 문을 이용하였는데, 아래의 week 처럼 룩업테이블을 이용하면
// 코드 가독성도 좋아질 뿐더러 유지보수에도 좋아~

int main() {

	int month, day, index = 0, i = 0;

	int daysOfMonth[12 + 1] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	char* week[] = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };

	scanf_s("%d %d", &month, &day);

	for (i = 1; i < month; i++) {
		index += daysOfmonth[i];
	}
	index += day - 1;

	printf("%s", week[index % 7]);

	return 0;
}