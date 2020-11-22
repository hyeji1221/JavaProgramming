package chapter8_example;
import java.io.*;

// ���� 8-10 : ���̳ʸ� ���� ����
public class BinaryCopy {
	public static void main(String[] args) {
		File src = new File("c:\\windows\\explorer.exe"); // �ҽ� ����
		File dst = new File("c:\\tmp\\explorer.bin"); // ���� ����
		FileInputStream fi = null;
		FileOutputStream fo = null;
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		int c;
		try {
		fi = new FileInputStream(src);
		fo = new FileOutputStream(dst);
		in = new BufferedInputStream(fi);
		out = new BufferedOutputStream(fo);
		while ((c = in.read()) != -1) {
		out.write((char)c);
		}
		in.close();
		out.close();
		fi.close();
		fo.close();
		} catch(IOException e) {
			System.out.println("���� ���� ����");
		}
	}
}
