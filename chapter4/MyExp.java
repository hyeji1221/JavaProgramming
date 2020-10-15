package chapter04_example;

// 예제 4-2 : 지수 클래스 MyExp 만들기
public class MyExp {
	int base;
	int exp;
	public int getValue() {
		int res = 1;
		for (int i = 0; i<exp; i++) 
			res *= base;
		return res;
	}
	public static void main(String[] args) {
		MyExp num = new MyExp();
		num.base = 2;
		num.exp = 3;
		
		MyExp num1 = new MyExp();
		num1.base = 3;
		num1.exp = 4;
		
		System.out.println("2의 3승 = " + num.getValue());
		System.out.println("3의 4승 = " + num1.getValue());
	}
}
