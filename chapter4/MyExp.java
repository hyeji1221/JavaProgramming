package chapter04_example;

// ���� 4-2 : ���� Ŭ���� MyExp �����
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
		
		System.out.println("2�� 3�� = " + num.getValue());
		System.out.println("3�� 4�� = " + num1.getValue());
	}
}
