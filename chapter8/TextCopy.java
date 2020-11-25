package chapter8_example;
import java.io.*;

// 예제 8-9 : 텍스트 파일 복사
public class TextCopy {
	public static void main(String[] args) {
		File src = new File("c:\\windows\\system.ini");
		File dst = new File ("C:\\Users\\lhg26\\OneDrive\\바탕 화면\\system.txt");
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		int c;
		try {
			fr = new FileReader(src);
			fw = new FileWriter(dst);
			in = new BufferedReader(fr);
			out = new BufferedWriter(fw);
			while((c = in.read()) != -1) {
				out.write((char)c);
			}
			in.close();
			out.close();
			fr.close();
			fw.close();
		} catch(IOException e) {
		System.out.println("파일 복사 오류");
		}
	}
}
