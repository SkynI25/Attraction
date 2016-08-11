import java.util.Scanner;
import java.util.regex.Pattern;

public class calculator {

	public static void main(String[] args) {
		String str1;
		int num1 = 0, num2 = 0;
		double x,y;
		Scanner sc = new Scanner(System.in);

		System.out.print("연산식을 입력하세요 [예:2+2] : ");
		str1 = sc.nextLine();
		String a, b;
		for (int i = 0; i < str1.length(); i++) {
			switch (str1.charAt(i)) {
			case '+':
				a = str1.substring(i + 1);
				num1 = Integer.parseInt(a);

				b = str1.substring(0, i);
				num2 = Integer.parseInt(b);
				System.out.printf("num1 : %d num2 : %d\n", num1, num2);
				System.out.println(num2 + num1);
				break;
			case '-' : 	
				a = str1.substring(i + 1);
				num1 = Integer.parseInt(a);

				b = str1.substring(0, i);
				num2 = Integer.parseInt(b);
				System.out.printf("num1 : %d num2 : %d\n", num1, num2);
				System.out.println(num2 - num1);
				break;
			case '*' :
				a = str1.substring(i + 1);
				num1 = Integer.parseInt(a);

				b = str1.substring(0, i);
				num2 = Integer.parseInt(b);
				System.out.printf("num1 : %d num2 : %d\n", num1, num2);
				System.out.println(num2 * num1);
				break;
			case '/' :
				a = str1.substring(i + 1);
				x = Double.parseDouble(a);
				if(x==0) {
					break;
				}
				b = str1.substring(0, i);
				y = Double.parseDouble(b);
				double result = y/x;
				System.out.printf("x : %.1f y : %.1f\n", x, y);
				System.out.printf("%f\n",result);
				break;
				
		}
		/*
		 * char index = str1.charAt(i); num1 = Integer.parseInt(index);
		 * 
		 * if(index>='0' && index <='9') { num1 = str1.charAt(i);
		 * System.out.println(str1.charAt(i) + " 첫번째 피연산자");
		 * System.out.println(num1 + " num1의 값"); } else if(index>='0' && index
		 * <='9' && num1 != 0) { num2 = str1.charAt(i);
		 * System.out.println(str1.charAt(i) + " 두번째 피연산자");
		 * System.out.println(num2 + " num2의 값"); }
		 */
		/*
		 * if(index == '+') { index_ = str1.charAt(i);
		 * System.out.println(str1.charAt(i) + " 연산자"); System.out.println(index
		 * + " 연산자"); } }
		 */
		}
	}
}
// TODO Auto-generated method stub