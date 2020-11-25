package chapter8_example;
import java.io.*;

// 예제 8-6 : 키보드 입력을 파일로 저장하기
public class FileWriterEx {
	public static void main(String[] args) {
		FileWriter fout = null;
		InputStreamReader in = new InputStreamReader(System.in);
		int c;
		try {
			fout = new FileWriter("C:\\Users\\lhg26\\OneDrive\\바탕 화면\\test.txt");
			while((c = in.read())!= -1) {
				fout.write(c);
			}
			in.close();
			fout.close();
			
		} catch(IOException e) {
			System.out.println("입출력오류");
		}
	}
}
