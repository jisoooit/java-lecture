package ch09;

public class Desktop extends Computer {

	@Override
	public void display() {
		System.out.println("Desktop display");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");
	}

	@Override //재정의도 해도 됨~
	public void turnOff() {
		System.out.println("Desktop turnOff");
	}
	
	
	
}
