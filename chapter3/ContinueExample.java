package week3_example;

// ���� 3-5 : 1���� 100���� ¦���� ��
public class ContinueExample {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i<=100; i++) {
			if (i %2 == 1)
				continue;
			else
				sum+=i;
		}
		System.out.println("1���� 100���� ¦���� ���� " + sum);
	}
}