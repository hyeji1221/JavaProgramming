package week2_practice;
import java.util.Scanner;

public class SuccessOrFail {
	public static void main(String[] args) {
		int score;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		score = sc.nextInt();
		if (score >= 80)
			System.out.println("�����մϴ�! �հ��Դϴ�.");
		sc.close();
	}
}
