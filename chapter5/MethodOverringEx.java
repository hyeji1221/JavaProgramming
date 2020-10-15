package Chapter5_example;

// 예제 5-4 : 메소드 오버라이딩 만들기
class DObject {
	public DObject next;
	public DObject() {next = null;}
	public void draw() {
		System.out.println("DObject draw");
	}
}
class Line extends DObject {
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends DObject {
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends DObject {
	public void draw() {
		System.out.println("Circle");
	}
}
public class MethodOverringEx {
	public static void main(String[] args) {
		DObject obj = new DObject();
		Line line = new Line();
		DObject p = new Line();
		DObject r = line;
		obj.draw();
		line.draw();
		p.draw();
		r.draw();
		DObject rect = new Rect();
		DObject circle = new Circle();
		rect.draw();
		circle.draw();
		
	}
}
