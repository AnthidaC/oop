package lab7_2;

import java.util.*;

import java.time.*;
public abstract class BankAccount implements Withdrawable{
	private String name;
	private double money;
//	private Date date;
//	
	public static Date getToday() {
		LocalDate day = LocalDate.now();
		int d=day.getDayOfMonth();
		int m=day.getMonthValue();
		int y=day.getYear();
		return new Date(d,m,y );
	}
//	
//	public BankAccount(String name) {
//		this(name,0,getToday());
//	
//	}
//	public BankAccount(String name, double amount, Date date) {
//		this.name =name;
//		this.money=amount;
//		this.date=date;
//	}
//	
	public abstract boolean deposit(double amount);
//	public void transfer (BankAccount other, double amount) {
//		if(amount<=this.money) {
//			other.deposit(amount);
//			this.withdraw(amount);
//		}
//	}
	public double property() {
		return this.money;
	}
	protected double getMoney() {
		return money;
	}
	protected void setMoney(double money) {
		this.money = money;
	}
	
//	public String getInfo() {
//		return this.name+" "+this.date.getDay()+"\\"+this.date.getMonth()+"\\"+this.date.getYear();
//	}
}
