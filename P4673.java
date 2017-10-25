public class Main {
	
	static int d(int n) {
		int ret = 0;
		ret = n;
		while(n > 0) {
			ret += n % 10;
			n /= 10;
		}
		return ret;
	}
	
	static boolean isSelfNumber(int n) {
		for(int i=1; i<n; i++) {
			if(n == d(i))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		for(int i=1; i<=10000; i++) {
			if(isSelfNumber(i)) {
				System.out.println(i);
			}
		}
	}
}