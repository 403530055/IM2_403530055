package bank;
import bank.BankAccount;

public class CheckingAccount extends BankAccount{
	
	
	public CheckingAccount (int accountNumber, double initialBalance){
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
		
	}

	
	public void withdraw(double amount){
		this.balance = this.balance - amount;
		deductFees();
	}
	
	public void deductFees(){
		double fee = 4.0;
		if(fee < this.balance)
			this.balance = this.balance - fee;
	}
	
	public void monthEnd(){
		
	}
}
