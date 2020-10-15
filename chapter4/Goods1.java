package chapter04_example;

// 예제 4-1 : 상품 하나를 표현하는 클래스 Goods 만들기
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
		System.out.println("상품 이름 : " +camera.name);
		System.out.println("상품 가격 : "+camera.price);
		System.out.println("재고 수량 : "+camera.numberOfStock);
		System.out.println("팔린 수량 : "+camera.sold);
	}
}
