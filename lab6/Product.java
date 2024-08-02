package lab6;

public class Product {
	  private String gg;
	  private int volumn;
	    private String name;
	    private double price;
	    
	    public Product(String c,String n, double p){
	        this.gg=c;
	        this.name=n;
	        this.price=p;
	    }
	    public String getCode(){
	        return gg;
	    }
	    public String getName(){
	        return name;
	    }
	    public double getPrice(){
	        return price;
	    }
	    public void setVolumn(int v) {
	    	this.volumn=v;
	    }
	    public int getVolumn(){
	        return this.volumn;
	    }
	    public void setWeight(int v) {
	    	this.volumn=v;
	    }
	}
