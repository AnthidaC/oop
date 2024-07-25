public class Product{
    private String code;
    private String name;
    private double price;
    
    public Product(String c,String n, double p){
        this.code=c;
        this.name=n;
        this.price=p;
    }
    public String getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
}
