package week2_practice;
import java.util.Scanner;

public class MultipleOfThree {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ�: ");
		num = sc.nextInt();
		
		if (num % 3 == 0)
			System.out.println("3�� ����Դϴ�.");
		else
			System.out.println("3�� ����� �ƴմϴ�.");
		sc.close();
	}
}
