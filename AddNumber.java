import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// ���� ������� ����
		// ó���� substring ���� �ڸ����� �����Ͽ� Ǯ���Ϸ��� �Ͽ���
		// ���ο� ���� ��� ������� �ϴ� �κа� ���ڿ��� �Է¹��� ���� ���ϴ� �κ��� ������� �־���
		// ����� �Ѱ����� �߰��ϰ� ������ �����Ͽ���
		int sum = 0;
		int x, y = 0;
		
		// / ����� % ������ ���� ���� �� �ڸ����� ���� �� �־���
		// ���ڿ����� ���� ���ϴ� ��� ���� �ٸ� ���
		x = N / 10;
		int xtmp = x;
		y = N % 10;
		int ytmp = y;
		// counts = ����Ŭ Ƚ��
		int counts = 0;

		while (true) {
			// �� �ڸ��� ���ϱ�
			sum = xtmp + ytmp;
			// �־��� ���� ������ ���ڸ��� xtmp�� ����
			xtmp = ytmp;
			// �տ��� ���� ���� ���� ������ �ڸ����� ytmp�� ����
			ytmp = sum % 10;
			counts++;
			if (xtmp == x && ytmp == y) {
				break;
			}
		}
		System.out.println(counts);
	}
}
