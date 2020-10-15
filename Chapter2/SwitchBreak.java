package week2_practice;
import java.util.Scanner;
public class SwitchBreak {
	public static void main(String[] args) {
		String grade;
		Scanner sc = new Scanner(System.in);
		grade = sc.next();
		
		switch (grade) {
		case "A":
		case "B":
			System.out.println("참 잘하였습니다.");
			break;
		case "C":
		case "D":
			System.out.println("좀 더 노력하세요.");
			break;
		case "F":
			System.out.println("다음 학기에 다시 수강하세요.");
			break;
		default:
			System.out.println("학점을 잘못 입력하였습니다.");
			break;
		}
		sc.close();
	}
}
