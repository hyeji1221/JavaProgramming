package week3_example;

// 예제 3-4 : 구구단
public class NestedLoop {
	public static void main(String[] args) {
		for (int i = 1; i<=9; i++, System.out.println()) {
			for (int j = 1; j<=9; j++, System.out.print("\t")) {
				System.out.print(i + "*" + j + "=" + i*j);
			}
		}
	}
}
