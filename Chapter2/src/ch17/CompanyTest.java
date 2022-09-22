package ch17;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company company = Company.getInstance();
		// 일반메서드로 선언했다면 얘를 호출하기 위해 instance하나를 만들어야 한다.
		//static으로 선언하면 인스턴스를 만들지 않고 바로 갖다쓸 수 있다.
		
		System.out.println(company);
		
		Calendar calendar = Calendar.getInstance();
		//calendar도 싱글톤이다. 날짜, 시간은 유일해야 하니까.
	}

}
