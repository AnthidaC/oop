package lab7_2;

public class SavingAccount extends BankAccount{
	private Employee owner;
	Card card ;
	
	public SavingAccount(Employee people) {
		this.owner=people;
		people.setAccount(this);
		card = new DebitCard(this);
		
	}
	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		super.setMoney(super.getMoney()+amount);
		return true;
	}

	@Override
	public boolean deposit(double amount) {
		if(super.getMoney()>=amount) {
			super.setMoney(super.getMoney()-amount);
			return true;
		}
		return false;
	}
	protected Employee getOwner() {
		return owner;
	}
	protected Card getCard() {
		return card;
	}
	
	
}
