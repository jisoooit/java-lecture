package ch06;

public class VIPCustomer extends Customer {

	
	double salesRatio;
	private String agentId;
	
//	public VIPCustomer() {
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		customerGrade="VIP";
//	}
	
	public VIPCustomer( int customerId, String customerName ) {
		super(customerId,customerName);
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade="VIP";
		
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -=(int)(price * salesRatio);
		return price;
	}
	
	public String getAgentId() {
		return agentId;
	}
	
}
