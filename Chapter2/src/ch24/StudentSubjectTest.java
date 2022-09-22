package ch24;

public class StudentSubjectTest {

	public static void main(String[] args) {

		Student Lee = new Student(1001, "Lee");
		
		Lee.addSubject("국어", 100);
		Lee.addSubject("수학", 50);
		
		Student Kim = new Student(1002, "Kim");
		
		Kim.addSubject("국어", 70);
		Kim.addSubject("수학", 85);
		Kim.addSubject("영어", 100);
		
		Lee.showScoreInfo();
		System.out.println("===============");
		Kim.showScoreInfo();
	}

}
