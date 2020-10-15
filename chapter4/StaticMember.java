package chapter04_example;

// 예제 4-8 : static을 이용한 달러와 우리나라 원화 사이의 변환 예제
class CurrencyConverter {
	private static double rate;
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toKWR(double dollar) {
		return dollar*rate;
	}
	public static void setRate(double r) {
		rate = r;
	}
}
public class StaticMember {
	public static void main(String[] args) {
		CurrencyConverter.setRate(1121);
		System.out.println("백만원은 "+CurrencyConverter.toDollar(1000000) + "달러입니다.");
		System.out.println("백달러는 "+CurrencyConverter.toKWR(100)+"원입니다.");
	}
	
}

