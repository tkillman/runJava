package hanJangHee.day1102;


class Account{
	String account;
	int balance;
	double interestRate;
	
	Account(){}
	
	Account(String account, int balance, double interestRate){
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate*0.01;}
	
	void setAccount(String account){
		 this.account = account;
	}
	
	String getAccount(){
		return account;
	}
	
	int getBalance(){
		return balance;
	}
	
	double calculateInterest(){
		return balance * interestRate;
	}
	
	void deposit(int money){
		balance += money;
		}
	
	void withdraw(int money){
		balance -= money;
	}
	
	
}




class AccountTest {

	public static void main(String[] args){
		
		Account account;
		
		account = new Account("441-0290-1203", 500000, 7.3);
	    System.out.println("°èÁÂÁ¤º¸: "+ account.getAccount() + " ÇöÀÚÀÜ¾×: " + account.getBalance());
		account.deposit(20000);
		System.out.println("°èÁÂÁ¤º¸: "+ account.getAccount() + " ÇöÀÚÀÜ¾×: " + account.getBalance());
		System.out.println("ÀÌÀÚ: " + account.calculateInterest());
	
	}
	
	
	
}
