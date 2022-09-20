package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
		/*byte bNum = 125;
		int iNum = bNum;
		
		int iNum2=255; //10은 그대로 나온다. byte에 들어갈 수 있는 값이니까
		byte bNum2=(byte)iNum2;
		
		System.out.println(iNum);
		System.out.println(bNum2);
		
		
		double dNum = 3.14;
		int iNum3 = (int)dNum;
		System.out.println(iNum3);*/
		
		double dNum = 1.2;
		float fNum = 0.9f;
		
		int iNum1=(int)dNum+(int)fNum;
		int iNum2=(int)(dNum+fNum);
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		int myNum = 10;
		int youtNum = 20;
		
		myNum +=youtNum;
		System.out.println(myNum);
	}

}
