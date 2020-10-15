package week3_example;

// 에제 3-5 : 1부터 100까지 짝수의 합
public class ContinueExample {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i<=100; i++) {
			if (i %2 == 1)
				continue;
			else
				sum+=i;
		}
		System.out.println("1부터 100까지 짝수의 합은 " + sum);
	}
}