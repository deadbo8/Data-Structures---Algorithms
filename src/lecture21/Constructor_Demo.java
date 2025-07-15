package lecture21;

class Student {
	String name;
	private int age;
	double marks;

	Student(String n, int a, double m) {
		name = n;
		age = a;
		marks = m;
	}

	Student(String name, int age) {  //this referce to class wala variable
		this.name = name;
		this.age = age;
	}

	public void detials() {
		System.out.println(name + " " + age + " " + marks);
	}
}

public class Constructor_Demo {
	public static void main(String[] args) {
		Student s1 = new Student("Akshant", 24,100.00);
		Student s2 = new Student("Dims", 24);

		s1.detials();
		s2.detials();
	}

}
