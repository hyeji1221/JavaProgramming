package week3_example;
import java.util.Scanner;

// 예제 3-7 : 배열에 입력 받은 수 중 제일 큰 수 찾기
public class ArrayAccess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intArray[] = new int[5];
		int max = 0;
		
		for (int i = 0; i<5; i++) {
			intArray[i] = sc.nextInt();
			if (intArray[i] > max)
				max = intArray[i];
		}
		System.out.println("입력된 수에서 가장 큰 수는 " + max + "입니다");
		sc.close();
	}
}
