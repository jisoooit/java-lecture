package ch16;

public class EmployTest {

	public static void main(String[] args) {
		
		System.out.println(Employ.getSerialNum());
		
		Employ Lee = new Employ();
		Lee.setEmployeeName("이순신");
		
		
		
		Employ Kim = new Employ();
		Kim.setEmployeeName("김유신");
		
		System.out.println(Lee.getEmployeeName()+"님의 사번은"+Lee.getEmployeeId());
		System.out.println(Kim.getEmployeeName()+"님의 사번은"+Kim.getEmployeeId());
		
		
	}

}
