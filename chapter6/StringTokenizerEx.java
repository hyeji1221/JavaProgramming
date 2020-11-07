package chapter6_example;
import  java.util.StringTokenizer;

// ¿¹Á¦ 6-6 : StringTokenizer Å¬·¡½º ¸Ş¼Òµå È°¿ë
public class StringTokenizerEx {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("È«±æµ¿/ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁã", "/");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}
