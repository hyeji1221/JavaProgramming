package Chapter7_example;
import java.util.Scanner;
import java.util.ArrayList;

// ���� 7-3 : ArrayList�� ���ڿ��� �ޱ�
public class ArrayListEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i<4; i++) {
			System.out.print("�̸��� �Է��ϼ���>> ");
			String str;
			str = sc.next();
			list.add(str);
		}
		for (int i = 0; i<list.size(); i++) {
			String s = list.get(i);
			System.out.print(s + " ");
			
		}
		int index = 0;
		for (int i = 1; i<list.size(); i++) {
			if (list.get(index).length() < list.get(i).length())
				index = i;
		}
		System.out.println("\n���� �� �̸��� : " + list.get(index));
		
	}
}
