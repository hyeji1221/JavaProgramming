package chapter8_example;
import java.io.*;

// ���� 8-6 : Ű���� �Է��� ���Ϸ� �����ϱ�
public class FileWriterEx {
	public static void main(String[] args) {
		FileWriter fout = null;
		InputStreamReader in = new InputStreamReader(System.in);
		int c;
		try {
			fout = new FileWriter("C:\\Users\\lhg26\\OneDrive\\���� ȭ��\\test.txt");
			while((c = in.read())!= -1) {
				fout.write(c);
			}
			in.close();
			fout.close();
			
		} catch(IOException e) {
			System.out.println("����¿���");
		}
	}
}
