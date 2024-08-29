package lab7_2;

public class DebitCard extends Card{

	private SavingAccount accound;

	@Override
	public String type() {
		return "visa";
	}

	@Override
	public double discount() {
		
		return 2.5f;
	}

	public SavingAccount getAccound() {
		return accound;
	}

    public DebitCard(SavingAccount accound) {
		this.accound = accound;
	}

	@Override
	public boolean withdraw(double amount) {
		return accound.withdraw(amount);
	}
	
}
