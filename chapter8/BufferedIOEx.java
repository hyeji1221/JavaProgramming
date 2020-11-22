package chapter8_example;
import java.io.*;

// ���� 8-7 : ���� ��Ʈ���� �̿��ϴ� ��� ����
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
			System.out.println("����� ����");
		}

	}
}
