package chapter04_example;

// 예제 4-7 : 접근 지정자의 사용
class Sample { 
	public int a; 
	private int b = 10; 
	int c;
	protected int d;
	
} 
public class AcessEx {
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10;
		//aClass.b = 10; // private으로 선언이 되었기 때문에 b는 Sample class 안에서만 접근 가능하다
		aClass.c = 10;
		aClass.d = 10;
	}
}
