package chapter8_example;
import java.io.*;
// 예제 8-3 : FileReader를 이용한 텍스트 파일 읽기 - system.ini 파일 읽기

public class FileReaderEx {
	public static void main(String[] args) {
		FileReader in = null;
		try {
			in = new FileReader("c:\\windows\\system.ini");
			int c;
			while((c = in.read()) != -1) { // 한 문자씩 읽는다
				System.out.print((char)c);
			}
			in.close();
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
