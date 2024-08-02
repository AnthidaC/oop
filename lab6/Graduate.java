package lab6;

public class Graduate extends Student {
	private String thesisTitle;
	public Graduate(int id,String name,double gpa,String tt ) {
		super(id,name,gpa);
		this.thesisTitle=tt;
	}
	public void setThesisTitle(String tt) {
		this.thesisTitle=tt;
	}
	public String getThesisTitle() {
		return thesisTitle;
	}
	public String toString() {
	    return "Graduate Student:"+super.getName()+"\nID: "+super.getId()+"\nGPA: "+super.getGPA()+"\nThesis: "+this.getThesisTitle()+"\n";
	  }
}
