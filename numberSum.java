import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int count = Integer.parseInt(s.nextLine());
		String str1 = s.nextLine();
		int flag = 0;
		int sum = 0;
		String[] a = new String[100];
		
		int[] arr= new int[count];
		
		
		
		
		
		for(int i=0; i<count; i++) {
			if(flag < count) {
			a[i] = str1.substring(i,i+1);
			arr[i] = Integer.parseInt(a[i]);
			sum += arr[i];
			flag++;
			}
		}
		
		System.out.println(sum);

	}

}
