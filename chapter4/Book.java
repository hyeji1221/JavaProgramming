package chapter04_example;

// ���� 4-5 : ������ ���ǿ� ȣ��
public class Book {
	String title;
	String author;
	int ISBN;
	public Book(String title, String author, int ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}
	public static void main(String[] args) {
		Book javaBook = new Book("Java JDK", "Ȳ����", 3333);
	}

}
