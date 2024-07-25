public class  Cashier{
    private String name;
    
    public Cashier(String n){
        this.name=n;
    }
    public void printReceipt(InventoryCart n){
        System.out.println("\tPumpkin Shop ("+name+")");
        double num=0;
        Product pp[]=n.getAllProdect();
        for(Product p : pp){
            if(p==null)break;
            System.out.println("1 x "+p.getName()+"\t("+p.getCode()+")\t"+p.getPrice());
            num+=p.getPrice();
        }
        System.out.println("\t\t---------------");
        System.out.println("\t\t\tTotal\t"+num+"$");
    }
}