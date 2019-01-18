package telran.bank.data;

public class BankAccount {
	
	private int account;
	private Person  owner;
	private double balance;
	
	
	public BankAccount(int accaunt, Person  owner, double balance) {
		super();
		this.account = accaunt;
		this.owner = owner;
		this.balance = balance;
	}
	public int getAccount() {
		return account;
	}
	public Person  getOwner() {
		return owner;
	}
	public double getBallance() {
		return balance;
	}
	
	@Override
	
	public String toString() {
		return "BankAccount account=" + account + ", owner=" + owner + ", balance=" + balance ;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + account;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (account != other.account)
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		return true;
	}
	
	public boolean credit(double sum){
		boolean flag=false;
		if(sum<=balance) {
			balance=balance-sum;
			flag=true;
		}	
		return flag;
	}
	public void debit(double sum){
		balance=balance+sum;
	}
	

}
