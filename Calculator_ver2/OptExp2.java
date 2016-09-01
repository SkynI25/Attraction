
public class OptExp2 {
	private String exp = "";

	public int evalPostfix(String postfix) {
		LinkedStack_ S = new LinkedStack_();
		exp = postfix;
		int opr1 = 0, opr2 = 0, value = 0;
		char testCh;
		for (int i = 0; i < exp.length(); i++) {
			exp = exp.trim(); // String ���� char�� �� ��ȯ �Ҷ� testch�� ���� �ΰ��� �پ�ͼ�
								// ������� �̻��ϰ� ���Դ�.
			// �ذ��ϱ����� �� ��ȯ �ϱ� ���� exp�� trim���� ������ �������ִ� ������� �������� �� ���Դ�. �� ������
			// ���Դ����� ���Ŀ� �ڵ���� �غ��鼭 Ȯ���غ��� �� ��.
			// System.out.printf("testCh[%d] : %s", i, testCh);
			testCh = exp.charAt(i);
			if (testCh != '+' && testCh != '-' && testCh != '*' && testCh != '/') {
				value = testCh - '0'; // char -> int ������ �� ��ȯ
				S.push_(value);
			} else {
				opr2 = S.pop_();
				opr1 = S.pop_();
				switch (testCh) {
				case '+':
					S.push_(opr1 + opr2);
					break;
				case '-':
					S.push_(opr1 - opr2);
					break;
				case '*':
					S.push_(opr1 * opr2);
					break;
				case '/':
					S.push_(opr1 / opr2);
					break;
				}
			}
		}
		return S.pop_();
	}
}
