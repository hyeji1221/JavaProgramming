package chapter04_example;

// ���� 4-7 : ���� �������� ���
class Sample { 
	public int a; 
	private int b = 10; 
	int c;
	protected int d;
	
} 
public class AcessEx {
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10;
		//aClass.b = 10; // private���� ������ �Ǿ��� ������ b�� Sample class �ȿ����� ���� �����ϴ�
		aClass.c = 10;
		aClass.d = 10;
	}
}
