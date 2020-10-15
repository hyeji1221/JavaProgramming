package Chapter5_example;

// 오버라이딩 활용
public class Overridingex {
	public static void main(String[] args) {
		DObject start, n, obj;
		start = new Line();
		n = start;
		obj = new Rect();
		n.next = obj;
		n = obj;
		obj = new Line();
		n.next = obj;
		n = obj;
		obj = new Circle();
		n.next = obj;
		while (start != null)
		{
			start.draw();
			start= start.next;
		}
		
	}
}
