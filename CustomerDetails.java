package SimpleBankingApplication;

public class CustomerDetails {
	private String customerName;// use "private" Access Specifier 
	private int customerID;
	private String acc_type; //declaration of variables
	private String customerAccNo;
	private int amount;
	private long balance;

     
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}

	public String getCustomerAccNo() {
		return customerAccNo;
	}
	public void setCustomerAccNo(String customerAccNo) {
		this.customerAccNo = customerAccNo;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
}
