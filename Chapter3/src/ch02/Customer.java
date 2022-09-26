package ch02;

public class Customer {
	
	protected int customerId; //���� Ŭ�������� ������ �� �ְ� �ϱ� ���ؼ�
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	

	
//	public Customer() {
//		customerGrade="SILVER";
//		bonusRatio = 0.01;
//	}
	
	public Customer(int customerId, String customerName) {
			this.customerId = customerId;
			this.customerName = customerName;
			
			customerGrade="SILVER";
			bonusRatio = 0.01;
			System.out.println("Customer(int,String) ������ ȣ��");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public String showCustomerInfo() {
		return customerName+"���� ����� "+customerGrade+"�̸�, ���ʽ� ����Ʈ�� "+bonusPoint+"�Դϴ�";
		
	}
}