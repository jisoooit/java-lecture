package ch17;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company company = Company.getInstance();
		// �Ϲݸ޼���� �����ߴٸ� �긦 ȣ���ϱ� ���� instance�ϳ��� ������ �Ѵ�.
		//static���� �����ϸ� �ν��Ͻ��� ������ �ʰ� �ٷ� ���پ� �� �ִ�.
		
		System.out.println(company);
		
		Calendar calendar = Calendar.getInstance();
		//calendar�� �̱����̴�. ��¥, �ð��� �����ؾ� �ϴϱ�.
	}

}
