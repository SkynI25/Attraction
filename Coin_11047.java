import java.util.Arrays;
import java.util.Scanner;

public class Coin_11047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, K, count = 0, f = 0, i = 0;
		N = sc.nextInt();
		K = sc.nextInt();
		int coin[] = new int[N];

		for (int j = N - 1; j >= 0; j--) {
			coin[j] = sc.nextInt();
		}

		// �����ذ��� ���� �ڵ��ۼ��� �ݹ������� ��Ÿ�ӿ����� �ذ��ϱ� ���� �ð��� �Һ��� ����.
		// �������� �ڵ带 �����غ��� ��� �������� Ȯ���غ��� �ٸ� ���� �߿�
		// i���� while���� �� �� -1 �Ǵ� N���� �ʰ��ϴ� ��찡 �ִٰ� �ؼ� while ���� ������ �����ְ� �����ϴ� �¾Ҵٰ�
		// ����.
		// ó���� �迭�� N���� ������ 1<= N <= 10 �� ������ϴ��� �˰� ������ ���߱� ���� �̸����� �õ��غ�������
		// �迭������ �����ϴ°� �ʹ� ������� �����ϰ� while���� �����ϰ� �����ߴµ� �¾Ҵٰ� ����.
		// �ᱹ �迭 ������ N�� ������ �ƹ��� ����� ������ ��.
		// ������ ������� �Ϳ� �ð��� ����� �� ���� �㹫�ߴ�. ������ ���п� �Ź� ������� �޴� �迭�� ���� ���� �ð�
		// �����Ͽ� ��� �� �־���. �������� �迭������ ���ؼ� ����� ����
		// �׸��� ������ ���� for���� while���� ���� ���ذ� �� �� �ʿ��ϴٴ� ���� ������.

		while (i >= 0 && i < N) {
			if (coin[i] > K) {
				i++;
			} else if (coin[i] < K) {
				K -= coin[i];
				count++;
			} else {
				f = 1;
				count++;
				break;
			}
		}

		if (f == 1)
			System.out.println(count);
		else {
			System.out.println("���ڰ� �߸� �ԷµǾ����ϴ�");
		}
	}
}
