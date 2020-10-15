package Chapter5_example;

// ���� 5-3 : instanceof�� �̿��� ��ü ����
class Person {}
class Student extends Person {}
class Researcher extends Person{}
class Professor extends Researcher{}

public class InstanceofExample {
	public static void main(String[] args) {
		Person jee = new Student();
		Person kim = new Professor();
		Person lee = new Researcher();
		if (jee instanceof Student) 
			System.out.println("jee�� Student Ÿ��"); 
		if (jee instanceof Researcher)  
			System.out.println("jee�� Researcher Ÿ��"); 
		if (kim instanceof Student) 
			System.out.println("kim�� Student Ÿ��"); 
		if (kim instanceof Professor) 
			System.out.println("kim�� Professor Ÿ��"); 
		if (kim instanceof Researcher) 
			System.out.println("kim�� Researcher Ÿ��"); 
		if (kim instanceof Person) 
			System.out.println("kim�� Person Ÿ��"); 
		if (lee instanceof Professor) 
			System.out.println("lee�� Professor Ÿ��"); 
		if ("java" instanceof String) 
			System.out.println("\"java\"�� String Ÿ��");
	}
}
