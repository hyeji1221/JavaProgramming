package chapter8_example;
import java.io.*;
// ���� 8-5 : ���� ���� ������ �߸��� �ѱ� �ؽ�Ʈ ���� �б�

public class FileReadHangulFail {
	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("C:\\Users\\lhg26\\OneDrive\\���� ȭ��\\hangul.txt");
			in = new InputStreamReader(fin, "US-ASCII");
			int c;
			System.out.println("���ڵ� ���� ������ "+in.getEncoding());
			while((c = in.read())!= -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		}catch(IOException e) {
			System.out.println("����� ����");
		}
	}
}
