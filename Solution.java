import java.util.Scanner;

//change class name to "Main"
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int a = fs.nextInt(), b = fs.nextInt();
			System.out.println(isPrime(a + b) ? "Alice" : "Bob");
		}
		fs.close();
	}
	
	static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
