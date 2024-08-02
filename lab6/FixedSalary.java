package lab6;

public class FixedSalary extends Employee {
	private double money;
	public FixedSalary(String first, String last, String ssn,double m) {
		super(first,last,ssn);
		this.money=m;
	}
	public double earnings(){
		return money;
	}
	public String toString() {
		return "Fixed salary employee:"+super.toString()+"\nmonthly salary: $"+money;
	}
}
class HourlySalary extends Employee {
	private double money;
	private double hour;
	public HourlySalary(String first, String last, String ssn,double m,double h) {
		super(first,last,ssn);
		this.money=m;
		this.hour=h;
	}
	public double earnings(){
		return money*hour;
	}
	public String toString() {
		return "hourly employee:"+super.toString()+"\nhourly pay: $"+money+"; hours worked: "+hour;
	}
}
class CommissionPay extends Employee {
	private double money;
	private double commit;
	public CommissionPay(String first, String last, String ssn,double m,double h) {
		super(first,last,ssn);
		this.money=m;
		this.commit=h;
	}
	public double earnings(){
		return money*commit;
	}
	public String toString() {
		return "commission employee:"+super.toString()+"\ngross sales: $"+money+";  commission rate: "+commit;
	}
}