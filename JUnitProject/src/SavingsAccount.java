public class SavingsAccount{
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	
	public SavingsAccount(int accNum, String accHol, double accBal) {
		this.accountBalance = accBal;
		this.accountHolder = accHol;
		this.accountNumber = accNum;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	@Override
	public String toString(){
		return "Account Number: " + this.accountNumber + "\nAccount Holder: " + this.accountHolder + "\nAccount Balance: " + this.accountBalance;
	}
	
	
	public void withdraw(double amountToWithdraw) {
		this.accountBalance = this.accountBalance + amountToWithdraw;
	}
	
	public void deposit(double amountToDeposit) {
		this.accountBalance = this.accountBalance + amountToDeposit;
	}
}