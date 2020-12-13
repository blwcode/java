package primarystudent;

public class Dowhiletest {
	public static void main() {
		int sum = 0;
		int n = 1;
		do {
			sum = sum + n;
			n++;
		} while (n <= 100);
		System.out.println(sum);
	}
}
