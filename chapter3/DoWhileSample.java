package week3_example;

// ���� 3-3 : a-z���� ���
public class DoWhileSample {
	public static void main(String[] args) {
		char a = 'a';
		do {
			System.out.print(a);
			a = (char) (a+1);
		} while (a <='z');
	}
}
