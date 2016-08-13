
public class OptExp2 {
	private String exp = "";

	public int evalPostfix(String postfix) {
		LinkedStack_ S = new LinkedStack_();
		exp = postfix;
		int opr1 = 0, opr2 = 0, value = 0;
		char testCh;
		for (int i = 0; i < exp.length(); i++) {
			exp = exp.trim(); // String 에서 char로 형 변환 할때 testch에 공백 두개가 붙어나와서
								// 결과값이 이상하게 나왔다.
			// 해결하기위해 형 변환 하기 전에 exp에 trim으로 공백을 제거해주니 결과값이 오류없이 잘 나왔다. 왜 공백이
			// 나왔는지는 추후에 코드검토 해보면서 확인해봐야 할 듯.
			// System.out.printf("testCh[%d] : %s", i, testCh);
			testCh = exp.charAt(i);
			if (testCh != '+' && testCh != '-' && testCh != '*' && testCh != '/') {
				value = testCh - '0'; // char -> int 데이터 형 변환
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
