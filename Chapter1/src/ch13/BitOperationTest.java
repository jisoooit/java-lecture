package ch13;

public class BitOperationTest {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 10;
		
		System.out.println( num1 | num2 );
		System.out.println( num1 & num2 );
		System.out.println( num1 ^ num2 );
		System.out.println( ~num1 );
		
		System.out.println(num1 <<= 2); //2�� 2�� ��ŭ x�� ���� ����.
		System.out.println(num1 >> 2); //2�� 2�� ��ŭ /��
	}

}
