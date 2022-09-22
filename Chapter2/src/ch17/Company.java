package ch17;

public class Company {
	
	private static Company instance = new Company(); //������ �ν��Ͻ�
	private Company() {};
	
	public static  Company getInstance() { //�ν��Ͻ��� �����ϰ� ���� �ʰ� �޼��带 ȣ���� �� �־�� �ϴϱ� static���� �����ؾ� �Ѵ�. �׷��� �ܺο��� Ŭ���� �̸����� �� �޼��带 ȣ�Ⱑ���ϴ�. 
		if ( instance == null ) {
			instance = new Company();
		}
		return instance;
	}
	
}
