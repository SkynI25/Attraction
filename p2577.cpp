#include <iostream>
#include <vector>
#include <algorithm>
#include <sstream>
#include <queue>
#include <stack>
#include <string>
using namespace std;
int main() {

	int arr[10] = { 0 };
	int a, b, c,ans;

	scanf("%d %d %d", &a,&b,&c);

	ans = a * b * c;

	while (ans != 0) {
		arr[ans % 10] += 1;
		ans /= 10;
	}

	for (int i = 0; i < 10; i++) {
		cout << arr[i] << endl;
	}

	return 0;

}