package Chapter5_example;

// 예제 5-1 : 클래스 상속 만들어보기
class Point {
	int x, y;
	void set(int x, int y) {
		this.x = x; 
		this.y = y;
	}
	void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}
public class ColorPoint extends Point{
	String s;
	void setColor(String s) {
		this.s = s;
	}
	void showColorPoint() {
		System.out.print(s);
		showPoint();
	}
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint();
		cp.set(3,4);
		cp.setColor("red");
		cp.showColorPoint();
	}
}
