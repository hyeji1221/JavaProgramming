package chapter6_example;

class Point1 {
	int x, y;
	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "Point("+x+","+y+")";
	}
}

public class ObjectProperty1 {
	public static void main(String[] args) {
		Point1 a = new Point1(2,3);
		System.out.println(a);
	}
}
