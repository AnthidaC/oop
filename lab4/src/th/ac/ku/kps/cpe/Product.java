package th.ac.ku.kps.cpe;

public class Product {
	private int code;
	private String name;
	private double price;
	
	public Product(int c) {
		this(c,"",0);
	}
	public Product(int c,String n,double p) {
		this.setName(n);
		this.setCode(c);
		this.setPrice(p);
	}
	public void setCode(int c) {
		this.code=c;
	}
	public void setName(String nameP) {
		this.name=nameP;
	}
	public void setPrice(double p) {
		this.price =p;
	}
	public int getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
}
