import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		String str1 = s.nextLine();
		int index = 0;
		int b = str1.length()/10 + 1;
		int count = 0;
		String a;

		for (int i = 0; i < b; i++) {
			if(str1.length() / 10 - count >= 1) {
			a = str1.substring(index, index + 10);
			System.out.println(a);
			index += 10;
			count++;
			} else {
				a = str1.substring(index, str1.length());
				System.out.println(a);
				index += 10;
			}
		}
	}
}
