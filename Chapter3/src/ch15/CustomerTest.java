package ch15;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		Buy buyer = customer; // ��ĳ����
		buyer.buy();
		buyer.order(); //�����ǵ� �޼��� ȣ���
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		
		
	}

}