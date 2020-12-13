package primarystudent;
/*
 1.break,跳出。
 2.switch结构中的表达式。只能是如下6种之一：
 byte，short，char，int，枚举类型，string类型
 3.case之后只能放常量。
 */
public class Switchtest {
	public static void main (String[]args) {
		int num = 1;
		switch (num) {
		case 1:
			System.out.println("select1");
			break;
		case 2:
			System.out.println("select2");
			break;
		default:
			System.out.println("other");
		}
	}

}

