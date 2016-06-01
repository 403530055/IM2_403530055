package bank;
import java.util.*;

public class Bank {
	ArrayList<BankAccount> accountsList = new ArrayList<BankAccount>() ;
	//new
	void addCheckingAccount(int accountNumber, double initialBalance){
		CheckingAccount newCheckingAccount = new  CheckingAccount(accountNumber,initialBalance);
		accountsList.add(newCheckingAccount);
	}
	//new
	void addSavingsAccount(int accountNumber, double initialBalance, double interestRate){
		SavingsAccount newSavingsAccount = new  SavingsAccount(accountNumber,initialBalance,interestRate);
		accountsList.add(newSavingsAccount);
	}
	
	void addInterest(int accountNumber){
		
	}
	
	void deductFees(int accountNumber){
		
	}
	
	void transfer(int withdrawAcctNum,int depositAcctNum, double amount){
		
	}
	
	boolean areEqualaccounts(int accountNumber1, int accountNumber2){
		return true;
	}
	
	
	
	void deposit(int accountNumber, double initialBalance){
		for(int i=0; i< accountsList.size(); i++){
			if(accountsList.get(i).accountNumber == accountNumber){
				accountsList.get(i).deposit(initialBalance);
				break;
			}
		}
	}
	
	void withdraw(int accountNumber, double initialBalance){
		for(int i=0; i< accountsList.size(); i++){
			if(accountsList.get(i).accountNumber == accountNumber){
				accountsList.get(i).withdraw(initialBalance);
				break;
			}
		}
	}
	
	double getBalance(int accountNumber){
		for(int i=0; i< accountsList.size(); i++){
			if(accountsList.get(i).accountNumber == accountNumber)
				return accountsList.get(i).getBalance();  
		}
		return 0;
	}
	
	void suspendAccount(int accountNumber){
		for(int i=0; i< accountsList.size(); i++){
			if(accountsList.get(i).accountNumber == accountNumber){
				accountsList.get(i).setStatus("suspended");
				break;
			}
		}
	}
	
	void reOpenAccount(int accountNumber){
		for(int i=0; i< accountsList.size(); i++){
			if(accountsList.get(i).accountNumber == accountNumber){
				accountsList.get(i).setStatus("open");
				break;
			}
		}
		
	}
	
	void closeAccount(int accountNumber){
		for(int i=0; i< accountsList.size(); i++){
			if(accountsList.get(i).accountNumber == accountNumber){
				accountsList.get(i).setStatus("closed");
				break;
			}
		}
	}
	
	String getaccountsListtatus(int accountNumber){
		for(int i=0; i< accountsList.size(); i++){
			if(accountsList.get(i).accountNumber == accountNumber)
				return accountsList.get(i).state;
		}
		return "NOTFOUND NUMBER";
	}
	
	String summarizeAccountTransactions(int accountNumber){
		for(int i=0; i< accountsList.size(); i++){
			if(accountsList.get(i).accountNumber == accountNumber)
				return "Account #"+ accountNumber + " transactions:\n\n" + accountsList.get(i).getTransactions() + "End of transactions\n";
		}
		return "NOTFOUND NUMBER";
	}
	//new
	String summarizeAllaccountsList(){
		String sumA = "Bank Account Summary\n\n" ;
		sumA = sumA + "Account\tBalance\t#Transactions\tStatus\n";
		for(int i=0; i< accountsList.size(); i++){
			sumA = sumA + accountsList.get(i).accountNumber + "\t";
			sumA = sumA + accountsList.get(i).getBalance() + "\t\t";
			sumA = sumA + accountsList.get(i).retrieveNumberOfTransactions() + "\t";
			sumA = sumA + accountsList.get(i).state + "\n";
		}
		sumA = sumA + "End of Account Summary\n";
		
		return sumA;
	}

}
