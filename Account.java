public class Account{
	private double bvn;
	private String name;
	private String accountType;
	private double balance;
	private boolean isActive;
	

	public double getBvn(){
		return bvn;
	}

	public void setBvn(double bvn){
		this.bvn = bvn;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}
	
	public String getAccountType(){
		return accountType;
	}

	public void setAccountType(String accountType){
		this.accountType = accountType;
	}

	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}

	public boolean getAccountStatus(){
		return isActive;
	}

	public void setAccountStatus(boolean isActive ){
		this.isActive = isActive;
	}
}