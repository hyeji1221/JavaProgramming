package Chapter7_example;

import java.util.Vector;

// 예제 7-2 : Point 클래스의 객체들만 저장하는 벡터 만들기
class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "(" + x + "," +y+")";
	}
}
public class PointVectorEx {
	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>();
		v.add(new Point(2,3));
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		for (int i = 0; i<v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);
		}
	}
}
