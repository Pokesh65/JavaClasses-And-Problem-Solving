package DressShop;

import java.time.LocalDateTime;

public class CustomersDetails {
	
	private int CustomerId;
	private String CustomerName;
	private long CustomerNumber;
	private int ChoosedDress;
	private String ConfirmedDress;
	private int PaidAmount;
	private LocalDateTime PurchasedDateTime;
	private LocalDateTime ReturnDateTime;
	
	


	public CustomersDetails(int customerId, String customerName, long mobileNo, int choosedDress) {
		super();
		CustomerId = customerId;
		CustomerName = customerName;
		CustomerNumber = mobileNo;
		ChoosedDress = choosedDress;
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public String getCustomerName() {
		return CustomerName;
	}





	public long getCustomerNumber() {
		return CustomerNumber;
	}





	public int getChoosedDress() {
		return ChoosedDress;
	}





	public String getConfirmedDress() {
		return ConfirmedDress;
	}





	public int getPaidAmount() {
		return PaidAmount;
	}





	public LocalDateTime getPurchasedDateTime() {
		return PurchasedDateTime;
	}





	public LocalDateTime getReturnDateTime() {
		return ReturnDateTime;
	}





	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}





	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}





	public void setCustomerNumber(long customerNumber) {
		CustomerNumber = customerNumber;
	}





	public void setChoosedDress(int choosedDress) {
		ChoosedDress = choosedDress;
	}





	public void setConfirmedDress(String confirmedDress) {
		ConfirmedDress = confirmedDress;
	}





	public void setPaidAmount(int paidAmount) {
		PaidAmount = paidAmount;
	}





	public void setPurchasedDateTime(LocalDateTime purchasedDateTime) {
		PurchasedDateTime = purchasedDateTime;
	}





	public void setReturnDateTime(LocalDateTime returnDateTime) {
		ReturnDateTime = returnDateTime;
	}



}
