package week3_example;
import java.util.Scanner;

// 예제 3-8 : 배열 원소의 평균 구하기
public class ArrayLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intArray[] = new int [5];
		double sum = 0;
		
		for (int i = 0; i<intArray.length; i++)
			intArray[i] = sc.nextInt();
		for (int i = 0; i<intArray.length; i++) 
			sum += intArray[i];
		System.out.print("배열 원소의 평균은 " + sum/intArray.length+"입니다.");
		sc.close();
	}
	
}
