package lab6;

public class Undergrad extends Student {
	private String year;
	
	
	public Undergrad(int id,String name,double gpa,String year ) {
		super(id,name,gpa);
		this.year=year;
	}
	public void setYear(String y) {
		this.year=y;
	}
	public String getYear() {
		return year;
	}
	public String toString() {
	    return "Undergraduate Student:"+super.getName()+"\nID: "+super.getId()+"\nGPA: "+super.getGPA()+"\nYear: "+this.year+"\n";
	  }
}
