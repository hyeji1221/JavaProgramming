package Chapter5_example;

// 예제 5-2 : 상속 관계에 있는 클래스 간 멤버 접근
class Person {
	int age;
	public String name;
	protected int height;
	private int weight;
	void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
}
public class Student extends Person {
	void set() {
		age = 30;
		name = "홍길동";
		height = 175;
		setWeight(99);
	}
	public static void main (String[] args) {
		Student s = new Student();
		s.set();
	}
}
