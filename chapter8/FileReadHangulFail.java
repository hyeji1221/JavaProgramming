package chapter8_example;
import java.io.*;
// 예제 8-5 : 문자 집합 지정이 잘못된 한글 텍스트 파일 읽기

public class FileReadHangulFail {
	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("C:\\Users\\lhg26\\OneDrive\\바탕 화면\\hangul.txt");
			in = new InputStreamReader(fin, "US-ASCII");
			int c;
			System.out.println("인코딩 문자 집합은 "+in.getEncoding());
			while((c = in.read())!= -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
