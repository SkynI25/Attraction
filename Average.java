import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(sc.nextLine());
		//int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(sc.nextLine()," ");
		//StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		double max=0; double sum=0; double a=0;
		
		while(st.hasMoreTokens()) {
			a= Integer.parseInt(st.nextToken());
			if(max<a) {
				max = a;
			}
			sum+=a;
		}
		sum=(sum/max)*100.0;
		System.out.printf("%.2f", (sum/N));
		//br.close();
		sc.close();
		
	}  
}
