package lab7_2;

public abstract class Employee {
	protected String firstName;
	protected String lastName;
	protected String securityNumber;
	private SavingAccount account;
	
	public Employee(String first, String last, String ssn) {
	 firstName = first;
	 lastName = last;
	 securityNumber = ssn;
	 }
	public String toString() {
	return String.format("%s %s\nsocial security number: %s",
	firstName, lastName, securityNumber);
	
	 }
	public abstract double earnings();
	

	public Card getCard() {
		return account.getCard();
	}
	protected SavingAccount getAccount() {
		return account;
	}
	protected void setAccount(SavingAccount account) {
		this.account = account;
	}
	protected  String getSecurityNumber() {
		return this.securityNumber;
	}
}
