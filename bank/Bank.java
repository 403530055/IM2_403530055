package bank;
import java.util.*;

public class Bank {
	ArrayList<BankAccount> accounts = new ArrayList<BankAccount>() ;
	//new
	void addCheckingAccount(int accountNumber, double initialBalance){
		
	}
	//new
	void addSavingsAccount(int accountNumber, double initialBalance, double interestRate){
		
	}
	
	void addInterest(int accountNumber){
		
	}
	
	void deductFees(int accountNumber){
		
	}
	
	void transfer(int withdrawAcctNum,int depositAcctNum, double amount){
		
	}
	
	boolean areEqualAccounts(int accountNumber1, int accountNumber2){
		return true;
	}
	
	
	
	void deposit(int accountNumber, double initialBalance){
		for(int i=0; i< accounts.size(); i++){
			if(accounts.get(i).accountNumber == accountNumber){
				accounts.get(i).deposit(initialBalance);
				break;
			}
		}
	}
	
	void withdraw(int accountNumber, double initialBalance){
		for(int i=0; i< accounts.size(); i++){
			if(accounts.get(i).accountNumber == accountNumber){
				accounts.get(i).withdraw(initialBalance);
				break;
			}
		}
	}
	
	double getBalance(int accountNumber){
		for(int i=0; i< accounts.size(); i++){
			if(accounts.get(i).accountNumber == accountNumber)
				return accounts.get(i).getBalance();  
		}
		return 0;
	}
	
	void suspendAccount(int accountNumber){
		for(int i=0; i< accounts.size(); i++){
			if(accounts.get(i).accountNumber == accountNumber){
				accounts.get(i).setStatus("suspended");
				break;
			}
		}
	}
	
	void reOpenAccount(int accountNumber){
		for(int i=0; i< accounts.size(); i++){
			if(accounts.get(i).accountNumber == accountNumber){
				accounts.get(i).setStatus("open");
				break;
			}
		}
		
	}
	
	void closeAccount(int accountNumber){
		for(int i=0; i< accounts.size(); i++){
			if(accounts.get(i).accountNumber == accountNumber){
				accounts.get(i).setStatus("closed");
				break;
			}
		}
	}
	
	String getAccountStatus(int accountNumber){
		for(int i=0; i< accounts.size(); i++){
			if(accounts.get(i).accountNumber == accountNumber)
				return accounts.get(i).state;
		}
		return "NOTFOUND NUMBER";
	}
	
	String summarizeAccountTransactions(int accountNumber){
		for(int i=0; i< accounts.size(); i++){
			if(accounts.get(i).accountNumber == accountNumber)
				return "Account #"+ accountNumber + " transactions:\n\n" + accounts.get(i).getTransactions() + "End of transactions\n";
		}
		return "NOTFOUND NUMBER";
	}
	//new
	String summarizeAllAccounts(){
		String sumA = "Bank Account Summary\n\n" ;
		sumA = sumA + "Account\tBalance\t#Transactions\tStatus\n";
		for(int i=0; i< accounts.size(); i++){
			sumA = sumA + accounts.get(i).accountNumber + "\t";
			sumA = sumA + accounts.get(i).getBalance() + "\t\t";
			sumA = sumA + accounts.get(i).retrieveNumberOfTransactions() + "\t";
			sumA = sumA + accounts.get(i).state + "\n";
		}
		sumA = sumA + "End of Account Summary\n";
		
		return sumA;
	}

}
