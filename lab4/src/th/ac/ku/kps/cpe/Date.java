package th.ac.ku.kps.cpe;


public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int d,int m,int y){
		this.setDay(d);
		this.setMonth(m);
		this.setYear(y);
	}
	public void setDay(int d) {
		if(d<32&&d>0)
		this.day =d;
	}
	public void setMonth(int m) {
		if(m>0&&m<13)
		this.month=m;
	}
	public void setYear(int y) {
		if(y>=0)
		this.year=y;
	}
	public int getDay() {
	return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
}