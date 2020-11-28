package Chapter7_example;
import java.util.*;

// ���� 7-4 : Iterator�� �̿��Ͽ� Vector�� ��� ��� ����ϰ� �� ���ϱ�
public class IteratorEx {
	public static void main(String[] args) {
		Vector<Integer> v= new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		int sum = 0;
		it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println("���Ϳ� �ִ� ���� �� : " + sum);
	}
}
