package ch04;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer Lee = new Customer(10010, "�̼���");
		Lee.bonusPoint=1000;
		int price = Lee.calcPrice(1000);
		System.out.println(Lee.showCustomerInfo()+price);
		
		VIPCustomer Kim = new VIPCustomer(10020, "������");
		Kim.bonusPoint=10000;
		price = Kim.calcPrice(1000);
		System.out.println(Kim.showCustomerInfo()+ price);
		
		Customer vc = new VIPCustomer(12345,"noname");
		System.out.println( vc.calcPrice(price)); //�ν��Ͻ��� �޼��尡 ȣ���. 
	}

}
