package week4_example;
import java.util.Scanner;

// 예외 예제 1
public class ExceptionExample1 {
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;
		System.out.print("나뉨수를 입력하시오: ");
		dividend = rd.nextInt();
		System.out.print("나눗수를 입력하시오: ");
		divisor = rd.nextInt();
		System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 "+dividend/divisor+"입니다");
		
	}
}