package week2_practice;
import java.util.Scanner;
public class Grading2 {
	public static void main(String[] args) {
		int score;
		char grade;
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			score = sc.nextInt();
			switch (score/10) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
				break;
			}
			System.out.println("학점은 " + grade + "입니다.");
		}
		
	}
}
