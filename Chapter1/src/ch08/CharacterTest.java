package ch08;

public class CharacterTest {

	public static void main(String[] args) {

		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1); 
		
		char ch2=66;
		System.out.println(ch2);  //char�� �νĵǼ� ��µȴ�.
		System.out.println((char)ch2); //�ǹ� ���� ĳ����
		
		int ch3=67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		char han = '��';
		char ch = '\uD55c'; //16������ ǥ���Ǿ��ִ�. 16������ ���� �ϳ��� 4��Ʈ�� ǥ���ȴ�. ���ڰ� 4���ϱ� 2����Ʈ�� . 
		System.out.println(han);
		System.out.println(ch);
	}

}
