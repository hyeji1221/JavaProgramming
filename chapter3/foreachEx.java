package week3_example;

// ���� 3-9 for-each ���� �̿��� �ݺ��� Ȱ��
public class foreachEx {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		String names[] = {"���", "�ٳ���", "ü��", "����", "����"};
		int sum = 0;
		
		for (int k : num)
			sum+=k;
		System.out.println("���� " + sum);
		for (String s : names)
			System.out.print(s + " ");
		System.out.println();
	}

}
