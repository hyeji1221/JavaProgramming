package Chapter5_example;

// ���� 5-6 : �߻� Ŭ������ ����
abstract class Calculator {
	public abstract int add (int a, int b);
	public abstract int substract (int a, int b);
	public abstract double average(int[] a);
}
public class GoodCalc extends Calculator{
	public int add (int a, int b) {return a + b;}
	public int substract (int a, int b) {return a-b;}
	public double average(int[] a) {
		int sum = 0;
		for (int i = 0; i<a.length; i++)
			sum += a[i];
		return sum/a.length;
	}
	public static void main(String[] args) {
		 Calculator c = new GoodCalc();
		 System.out.println(c.add(2, 3));
		 System.out.println(c.substract(2, 3));
		 System.out.println(c.average(new int[] {2,3,4}));
	}
}
