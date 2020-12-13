package primarystudent;

public class Forshuzu {
	public static void main(String[] args) {
		int[] ns = { 1, 3, 5, 7, 8 };
		int sum = 0;
		for (int i = 0; i < ns.length; i++) {
			System.out.println("i=" + i + ",ns[i]" + ns[i]);
			sum = sum + ns[i];
		}
		System.out.println("sum=" + sum);
	}

}
