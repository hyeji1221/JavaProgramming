package week2_practice;
import java.util.Scanner;

public class SuccessOrFail {
	public static void main(String[] args) {
		int score;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하시오: ");
		score = sc.nextInt();
		if (score >= 80)
			System.out.println("축하합니다! 합격입니다.");
		sc.close();
	}
}
