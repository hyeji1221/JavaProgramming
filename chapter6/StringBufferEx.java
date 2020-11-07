package chapter6_example;

// 에제 6-5 : StringBuffer 클래스 메소드 활용
public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb.hashCode());
		sb = sb.append(" is pencil");
		System.out.println(sb);
		sb.insert(7, " my");
		System.out.println(sb);
		sb = sb.replace(8,10, "your");
		System.out.println(sb);
		sb.setLength(5);
		System.out.println(sb);
		System.out.println(sb.hashCode());
	}
}
