package week4_example;
import java.util.Scanner;

// ���� ���� 1
public class ExceptionExample1 {
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;
		System.out.print("�������� �Է��Ͻÿ�: ");
		dividend = rd.nextInt();
		System.out.print("�������� �Է��Ͻÿ�: ");
		divisor = rd.nextInt();
		System.out.println(dividend+"�� "+divisor+"�� ������ ���� "+dividend/divisor+"�Դϴ�");
		
	}
}