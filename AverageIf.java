package averageIf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		// 사용할 변수들 초기화
		double average = 0;
		double sum = 0;
		double index=0;
		int N = sc.nextInt();
		// 이차원 배열 선언, 입력받아야 하는 값들이 여러줄 이어서 이와 같이 함
		int [][] arr = new int[N][];
		// 배열을 위와 같이 선언할 수 있는 것을 배울 수 있었음
		for (int i = 0; i < N; i++) {
			// 문제에서 배열의 첫 원소가 한 행의 숫자가 되게 하는 부분을 구현하기 어려웠다
			// 전치행렬 푼 문제를 참고하였으나 방법을 찾기 어려웠고 소스를 보고 참고하였다
			// 그리고 아래와 같이 할 수 있는 것을 배웠다
			int k = sc.nextInt();
			// 배열의 첫번째 자리에 입력한 k를 부여하는 방식이 새로웠다
			// 배열을 사용하는 방법에 좀 더 익숙해져야 할 듯
			arr[i] = new int[k];
			for (int j = 0; j < k; j++) {
					arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < N; i++) {
			// 그리고 처음 for문을 시작할 때 이 처럼 초기화를 시켜줘야 한다
			// 왜냐하면 처음 i번째가 끝나고 다음 i번째가 시작될 때 이처럼 초기화 하지않으면 이전값에 누적되기 때문
			average = 0;
			sum = 0;
			index = 0;
			for (int j = 0; j < arr[i].length; j++) {
				// 처음에 sum의 합을 구하고 동시에 평균을 어떻게 처리해줄지 고민되엇는데 밑에처럼
				// 대입연산을 한 꺼번에 처리해줄 수 있는 것을 새로 배울 수 있었다
				average = (sum+=arr[i][j]) / arr[i].length;
			}
			for(int j=0; j<arr[i].length; j++) {
				if (arr[i][j] > average) {
					index++;
				}
			}
			// 그리고 %표시를 해주기 위해선 %% 로 입력해주어야함
			System.out.printf("%.3f%%\n",(double)((index*100)/(arr[i].length)));
		}
	}
}
