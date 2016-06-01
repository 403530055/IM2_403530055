package bank;
import java.util.*;

public class BankAccount {
	
	String state;
	int accountNumber;
	private double balance;
	private ArrayList<Double> transaction = null; 
	
	BankAccount(){
		
	}
	
	BankAccount(int aAccountnumber,double iBalance){
		this.state="open";
		this.accountNumber = aAccountnumber;
		this.balance = iBalance;
		this.transaction = new ArrayList<Double>();
	}
	//new
	public boolean equals(Object o){
		return true;
	}
	
	double getBalance(){
		return this.balance;
	}
	
	void deposit(double moneyIn){
		if(isOpen()){
			addTransaction(moneyIn);
			this.balance += moneyIn; 
		}
			
	}
	
	void withdraw(double moneyOut){
		if(isOpen()){
			if((this.balance-moneyOut) < 0){
				addTransaction(Math.PI);
			}else{
			addTransaction(0-moneyOut);
			this.balance -= moneyOut;
			}
		}
	}
	
	void setStatus(String status){
		if(isOpen())
			if(status.equals("suspended"))
				suspend();
			else if(status.equals("closed"))
				close();
		if(isSuspended())
			if(status.equals("open"))
				reOpen();
			else if(status.equals("closed"))
				close();
	}
	
	private void suspend(){
		this.state = "suspended";
	}
	
	private void close(){
		if(this.state != "closed"){
			withdraw(this.balance);
		}
		this.state = "closed";
	}
	
	private void reOpen(){
		this.state = "open";
	}
	
	boolean isOpen(){
		
		return this.state.equalsIgnoreCase("open");
	
	}
	
	boolean isSuspended(){
		
		return this.state.equalsIgnoreCase("suspended");
	}
	
	boolean isClosed(){
		
		return this.state.equalsIgnoreCase("closed"); 
	}
	
	void addTransaction(double amount){
		this.transaction.add(amount);
	}
	
	String getTransactions(){
		String transactionList= "";
		for(int i=0; i<this.transaction.size(); i++){
			if( this.transaction.get(i) == Math.PI) transactionList = transactionList + (i+1) + ": warn:¾lÃB¤£¨¬!!!\n";
			else transactionList = transactionList + (i+1) + ": " + this.transaction.get(i) + "\n";
		}
		return transactionList;
	}
	
	int retrieveNumberOfTransactions(){
		int temp=this.transaction.size();;
		for(int i=0; i<this.transaction.size(); i++){
			if( this.transaction.get(i) == Math.PI) temp -= 1;
		}
		return temp;
	}
	
}
