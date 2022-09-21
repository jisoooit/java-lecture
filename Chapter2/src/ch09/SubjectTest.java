package ch09;

public class SubjectTest {

	public static void main(String[] args) {
		
		Student Lee = new Student ( 100, "Lee");
		Lee.setKoreaSubject("국어", 100);
		Lee.setMathSubject("수학", 99);
		
		Student Kim = new Student ( 200, "Kim");
		Kim.setKoreaSubject("국어", 50);
		Kim.setMathSubject("수학", 40);
		
		Lee.showScoreInfo();
		Kim.showScoreInfo();
	}

}
