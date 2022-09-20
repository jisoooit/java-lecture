package ch12;

public class LogicalTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ( (num1 = num1 + 10) < 10 ) && ( (i = i + 2) < 10 );
		
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); //앞에 항이 false기 때문에 뒤쪽 항을 보지 않아서 값이 그대로임.
	}

}
