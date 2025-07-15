package lecture21;

class Student {
	String name;
	int age;
	double marks;
	
	
	Student(String n, int a ,double m) {
		name=n;
		age=a;
		marks=m;
	}
	
	 public void detials(){
		System.out.println(name+" "+age+" "+marks);
	}
	 
	 
	 public static void f() {
		 System.out.println("Hello");
	 }
}
	

public class Constructor_Demo {
	public static void main(String[] args) {
		Student s1 = new Student("Akshant",23, 100.0);
		
		s1.detials();
	}

}
