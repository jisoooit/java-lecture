package ch09;

public class SubjectTest {

	public static void main(String[] args) {
		
		Student Lee = new Student ( 100, "Lee");
		Lee.setKoreaSubject("����", 100);
		Lee.setMathSubject("����", 99);
		
		Student Kim = new Student ( 200, "Kim");
		Kim.setKoreaSubject("����", 50);
		Kim.setMathSubject("����", 40);
		
		Lee.showScoreInfo();
		Kim.showScoreInfo();
	}

}
