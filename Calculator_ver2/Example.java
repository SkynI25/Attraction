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
			System.out.println("괄호 맞음!");
		else
			System.out.println("괄호 틀림!!!");

		System.out.printf("\n후위표기식 : ");
		postfix = opt.toPostfix(exp);
		System.out.println(postfix);
		for(int i=0; i< postfix.length; i++) {
			exp2 += Character.toString(postfix[i]);
		}// char -> String 데이터 형 변환
		// exp2 = new String(postfix, 0, postfix.length); // String 객체 생성자함수 사용한 형 변환
		result = opt2.evalPostfix(exp2);
		System.out.printf("\n 연산결과 = %d \n", result);
	}

}
