package chapter8_example;
import java.io.*;

// 예제 8-2 : FileOutputStream을 이용한 파일 쓰기
public class FileOutputStreamEx {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\lhg26\\OneDrive\\바탕 화면\\컴구 강의\\test.out");
			FileInputStream fin = new FileInputStream("C:\\Users\\lhg26\\OneDrive\\바탕 화면\\컴구 강의\\test.out");
			
			for (int i = 0; i<10; i++) {
				int n = 10-i;
				fout.write(n);
			}
			fout.close();
			//fin = new FileInputStream("바탕 화면");
			int c = 0;
			while ((c = fin.read()) != -1) {
				System.out.print(c + " ");
			}
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력오류");
		}
	}

}
