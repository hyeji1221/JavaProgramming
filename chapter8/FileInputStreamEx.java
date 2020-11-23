package chapter8_example;
import java.io.*;

// 예제 8-1 : 윈도우에 있는 system.ini 파일을 읽어 화면에 출력하기
public class FileInputStreamEx {
	public static void main(String[] args) {
		FileInputStream in = null;
		try {
			in = new FileInputStream("c:\\windows\\system.ini");
			int c;
			while((c = in.read())!= -1) {
				System.out.print((char)c);
			}
			in.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
		
	}
}
