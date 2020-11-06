package chapter6_example;

// ¿¹Á¦ 6-3 : ¹Ú½Ì ¾ð¹Ú½ÌÀÇ ¿¹
public class AutoBoxingUnBoxing {
	public static void main(String[] args) {
		int i = 10;
		Integer intObject = i;
		System.out.println("intObject = "+ intObject);
		i = intObject.intValue()+10;
		System.out.println("i = " + i);
	}
}
