package chapter6_example;

// ���� 6-3 : �ڽ� ��ڽ��� ��
public class AutoBoxingUnBoxing {
	public static void main(String[] args) {
		int i = 10;
		Integer intObject = i;
		System.out.println("intObject = "+ intObject);
		i = intObject.intValue()+10;
		System.out.println("i = " + i);
	}
}
