package ch16;

public class EmployTest {

	public static void main(String[] args) {
		
		System.out.println(Employ.getSerialNum());
		
		Employ Lee = new Employ();
		Lee.setEmployeeName("�̼���");
		
		
		
		Employ Kim = new Employ();
		Kim.setEmployeeName("������");
		
		System.out.println(Lee.getEmployeeName()+"���� �����"+Lee.getEmployeeId());
		System.out.println(Kim.getEmployeeName()+"���� �����"+Kim.getEmployeeId());
		
		
	}

}
