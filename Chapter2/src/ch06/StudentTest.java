package ch06;

public class StudentTest {

	public static void main(String[] args) {
		
		Student Lee = new Student();
		
		System.out.println(Lee.showStudentInfo());
		
		Student Kim = new Student(123456, "Kim", 3);
	    System.out.println(Kim.showStudentInfo());
	}

}
