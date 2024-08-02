package lab6;

public class Student {
	private String name;
	private int id;
	private double gpa;
	
	public Student(int id,String name,double gpa) {
		this.setName(name);
		this.id=id;
		this.gpa=gpa;
	}
	public Student(int id,double gpa) {
		this(id," ",gpa);
	}
	
	public String getName() {
		return name;
	}
	public double getGPA() {
		return gpa;
	}
	public int getId() {
		return id;
	}
	public void setName(String n) {
		this.name=n;
	}
	public String toString() {
	    return "Student:"+name+"\nID: "+id+"\nGPA: "+gpa+"\n";
	  }

}
