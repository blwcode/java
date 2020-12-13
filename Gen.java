package primarystudent;

public class Gen {
	public static void main (String [] args) {
		double a = 1.0;
		double b = 3.0;
		double c = -4.0;
		double d = Math.sqrt(b*b-4*a*c);
		double r1 = (-b+d)/(2*a);
		double r2 = (-b+d)/(2*a);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r1==r2 && r2==r1 ? "测试成功" : "测试失败");
		
		
		
	}

}
