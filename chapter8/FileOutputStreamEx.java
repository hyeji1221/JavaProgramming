package chapter8_example;
import java.io.*;

// ���� 8-2 : FileOutputStream�� �̿��� ���� ����
public class FileOutputStreamEx {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\lhg26\\OneDrive\\���� ȭ��\\�ı� ����\\test.out");
			FileInputStream fin = new FileInputStream("C:\\Users\\lhg26\\OneDrive\\���� ȭ��\\�ı� ����\\test.out");
			
			for (int i = 0; i<10; i++) {
				int n = 10-i;
				fout.write(n);
			}
			fout.close();
			//fin = new FileInputStream("���� ȭ��");
			int c = 0;
			while ((c = fin.read()) != -1) {
				System.out.print(c + " ");
			}
			fin.close();
		} catch (IOException e) {
			System.out.println("����¿���");
		}
	}

}
