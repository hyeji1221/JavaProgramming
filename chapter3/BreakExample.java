package week3_example;
import java.util.Scanner;
// 3-6 : �Էµ� ���� ���� ����
public class BreakExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (true) {
			if(sc.nextInt() == -1)
				break;
			num++;
		}
		System.out.println("�Էµ� ������ ������ "+ num);
		sc.close();
	}

}
