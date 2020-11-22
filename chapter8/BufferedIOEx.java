package chapter8_example;
import java.io.*;

// 예제 8-7 : 버퍼 스트림을 이용하는 출력 예제
public class BufferedIOEx {
	public static void main(String[] args) {
		BufferedOutputStream bout = new BufferedOutputStream(System.out,5);
		InputStreamReader in = new InputStreamReader(System.in);
		int c;
		try {
			while((c = in.read())!= -1) {
				bout.write((char)c);
			}
			in.close();
			bout.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}

	}
}
