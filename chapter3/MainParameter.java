package week3_example;

// ���� 3-13 : main()�� ���ڵ��� �޾Ƽ� ��հ��� ����ϴ� ����
public class MainParameter {
	public static void main(String[] args) {
		double sum = 0.0;
		for (int i = 0; i<args.length; i++)
			sum += Double.parseDouble(args[i]);
		System.out.println("�հ� :"+sum);
		System.out.println("��� :" +sum/args.length);
	}
}
