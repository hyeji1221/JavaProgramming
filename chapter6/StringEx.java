package chapter6_example;

// 6-4 : String Ŭ���� �޼ҵ� Ȱ��
public class StringEx {
	public static void main(String[] args) {
		String a = new String(" abcd");
		String b = new String(",efg");
		a = a.concat(b);
		System.out.println(a);
		a = a.trim();
		System.out.println(a);
		a = a.replace("ab", "12");
		System.out.println(a);
		String s[] = a.split(",");
		for (int i = 0; i<s.length; i++) 
			System.out.println("�и��� "+i+"�� ���ڿ�: "+ s[i]);
		a = a.substring(3);
		System.out.println(a);
		char c = a.charAt(2);
		System.out.println(c);
	}
}
