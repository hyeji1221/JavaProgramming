package chapter6_example;
import  java.util.StringTokenizer;

// ���� 6-6 : StringTokenizer Ŭ���� �޼ҵ� Ȱ��
public class StringTokenizerEx {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("ȫ�浿/��ȭ/ȫ��/����/����", "/");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}
