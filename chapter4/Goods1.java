package chapter04_example;

// ���� 4-1 : ��ǰ �ϳ��� ǥ���ϴ� Ŭ���� Goods �����
public class Goods1 {
	String name;
	int price;
	int numberOfStock;
	int sold;
	
	public static void main(String[] args) {
		Goods1 camera = new Goods1();
		camera.name = "Nikon";
		camera.price = 400000;
		camera.numberOfStock = 30;
		camera.sold = 50;
		System.out.println("��ǰ �̸� : " +camera.name);
		System.out.println("��ǰ ���� : "+camera.price);
		System.out.println("��� ���� : "+camera.numberOfStock);
		System.out.println("�ȸ� ���� : "+camera.sold);
	}
}
