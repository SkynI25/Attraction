import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		OptExp opt = new OptExp();
		OptExp2 opt2 = new OptExp2();
		int result;
		String exp = sc.nextLine();
		String exp2= "";
		char postfix[];
		System.out.println(exp);
		if (opt.testPair(exp))
			System.out.println("��ȣ ����!");
		else
			System.out.println("��ȣ Ʋ��!!!");

		System.out.printf("\n����ǥ��� : ");
		postfix = opt.toPostfix(exp);
		System.out.println(postfix);
		for(int i=0; i< postfix.length; i++) {
			exp2 += Character.toString(postfix[i]);
		}// char -> String ������ �� ��ȯ
		// exp2 = new String(postfix, 0, postfix.length); // String ��ü �������Լ� ����� �� ��ȯ
		result = opt2.evalPostfix(exp2);
		System.out.printf("\n ������ = %d \n", result);
	}

}
