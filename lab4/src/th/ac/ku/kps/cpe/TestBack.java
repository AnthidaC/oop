package th.ac.ku.kps.cpe;

public class TestBack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount account1 = new BankAccount("account1");
		BankAccount account2 = new BankAccount("account2",500,new Date(1,11,2015));
		account1.deposit(1000);
		account2.transfer(account1, 300);
		System.out.println(account2.withdraw(300));
		System.out.println( account1.getInfo()+"\nmoney :"+account1.property());
		System.out.println( account2.getInfo()+"\nmoney :"+account2.property());
	}

}
