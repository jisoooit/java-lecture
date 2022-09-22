package ch17;

public class Company {
	
	private static Company instance = new Company(); //유일한 인스턴스
	private Company() {};
	
	public static  Company getInstance() { //인스턴스를 생성하고 하지 않고 메서드를 호출할 수 있어야 하니까 static으로 선언해야 한다. 그래야 외부에서 클래스 이름으로 이 메서드를 호출가능하다. 
		if ( instance == null ) {
			instance = new Company();
		}
		return instance;
	}
	
}
