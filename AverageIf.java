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
		// ����� ������ �ʱ�ȭ
		double average = 0;
		double sum = 0;
		double index=0;
		int N = sc.nextInt();
		// ������ �迭 ����, �Է¹޾ƾ� �ϴ� ������ ������ �̾ �̿� ���� ��
		int [][] arr = new int[N][];
		// �迭�� ���� ���� ������ �� �ִ� ���� ��� �� �־���
		for (int i = 0; i < N; i++) {
			// �������� �迭�� ù ���Ұ� �� ���� ���ڰ� �ǰ� �ϴ� �κ��� �����ϱ� �������
			// ��ġ��� Ǭ ������ �����Ͽ����� ����� ã�� ������� �ҽ��� ���� �����Ͽ���
			// �׸��� �Ʒ��� ���� �� �� �ִ� ���� �����
			int k = sc.nextInt();
			// �迭�� ù��° �ڸ��� �Է��� k�� �ο��ϴ� ����� ���ο���
			// �迭�� ����ϴ� ����� �� �� �ͼ������� �� ��
			arr[i] = new int[k];
			for (int j = 0; j < k; j++) {
					arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < N; i++) {
			// �׸��� ó�� for���� ������ �� �� ó�� �ʱ�ȭ�� ������� �Ѵ�
			// �ֳ��ϸ� ó�� i��°�� ������ ���� i��°�� ���۵� �� ��ó�� �ʱ�ȭ ���������� �������� �����Ǳ� ����
			average = 0;
			sum = 0;
			index = 0;
			for (int j = 0; j < arr[i].length; j++) {
				// ó���� sum�� ���� ���ϰ� ���ÿ� ����� ��� ó�������� ��εǾ��µ� �ؿ�ó��
				// ���Կ����� �� ������ ó������ �� �ִ� ���� ���� ��� �� �־���
				average = (sum+=arr[i][j]) / arr[i].length;
			}
			for(int j=0; j<arr[i].length; j++) {
				if (arr[i][j] > average) {
					index++;
				}
			}
			// �׸��� %ǥ�ø� ���ֱ� ���ؼ� %% �� �Է����־����
			System.out.printf("%.3f%%\n",(double)((index*100)/(arr[i].length)));
		}
	}
}
