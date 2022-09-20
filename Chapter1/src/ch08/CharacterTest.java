package ch08;

public class CharacterTest {

	public static void main(String[] args) {

		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1); 
		
		char ch2=66;
		System.out.println(ch2);  //char로 인식되서 출력된다.
		System.out.println((char)ch2); //의미 없는 캐스팅
		
		int ch3=67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		char han = '한';
		char ch = '\uD55c'; //16진수로 표현되어있다. 16진수는 숫자 하나가 4비트로 표현된다. 숫자가 4개니까 2바이트다 . 
		System.out.println(han);
		System.out.println(ch);
	}

}
