package ch14;

public class TakeTransTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student J = new Student("James",5000);
		Student T = new Student("Tomas",10000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 =new Bus(500);
		
		J.takeBus(bus100);
		
		Subway green = new Subway(2);
		T.takeSubway(green);
		
		J.showInfo();
		T.showInfo();
		bus100.showBusInfo();
		green.showSubwayInfo();
	}

}
