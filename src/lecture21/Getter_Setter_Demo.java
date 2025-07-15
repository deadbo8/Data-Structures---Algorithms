package lecture21;

class Student1 {
	String name;
	private int age;
	double marks;

	Student1(String n, int a, double m) {
		name = n;
		age = a;
		marks = m;
	}

	Student1(String name, int age) { // this referce to class wala variable
		this.name = name;
		this.age = age;
	}

	public void setage(int a) {
		if(a>0 && a<=100) {
			age = a;
		}

	}

	public int getage() {
		return age;
	}

	public void detials() {
		System.out.println(name + " " + age + " " + marks);
	}
}

public class Getter_Setter_Demo {
	public static void main(String[] args) {
		Student1 s1 = new Student1("Akshant", 24, 100.00);
		Student1 s2 = new Student1("Dims", 24);

		s1.detials();
		s1.setage(-17);
		System.out.println(s1.getage());

		s2.detials();
	}
}
