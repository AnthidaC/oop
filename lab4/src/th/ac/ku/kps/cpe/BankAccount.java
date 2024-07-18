package th.ac.ku.kps.cpe;

import java.util.*;
import java.time.*;
public class BankAccount {
	private String name;
	private double money;
	private Date date;
	
	public static Date getToday() {
		LocalDate day = LocalDate.now();
		int d=day.getDayOfMonth();
		int m=day.getMonthValue();
		int y=day.getYear();
		return new Date(d,m,y );
	}
	
	public BankAccount(String name) {
		this(name,0,getToday());
	
	}
	public BankAccount(String name, double amount, Date date) {
		this.name =name;
		this.money=amount;
		this.date=date;
	}
	
	public void deposit(double amount) {
		this.money+=amount;
	}
	public boolean withdraw(double amount) {
		if(money>=amount)
		{
			this.money-=amount;
			return true;
		}
		return false;
		}
	public void transfer (BankAccount other, double amount) {
		if(amount<=this.money) {
			other.deposit(amount);
			this.withdraw(amount);
		}
	}
	public double property() {
		return this.money;
	}
	public String getInfo() {
		return this.name+" "+this.date.getDay()+"\\"+this.date.getMonth()+"\\"+this.date.getYear();
	}
}
