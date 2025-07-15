package lecture21;

 class Student_Demo {
	String name;
	int age;
	double marks;
	
	 public void detials(){
		System.out.println(name+" "+age+" "+marks);
	}
	 
	 
	 public static void f() {
		 System.out.println("Hello");
	 }
	
}

 public class Students_OOPS_Demo{
	public static void main(String[] args) {
		
			Student_Demo s1 = new Student_Demo();
			
			s1.name="Akshant";
			s1.age=23;
			s1.marks=100.0;
			
			Student_Demo.f();
			s1.detials();
		
	}
}
