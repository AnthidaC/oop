package lab7_2;

public class InventoryCart {
    private Product[] product;

    public InventoryCart(int num){
        this.product=new Product[num];
    }
    
    public void add(Product p){
        for (int i=0;i<product.length;i++){
            if(product[i] == null){
                product[i]=p;
                break;
            }
        } 
    }
    public Product getProdect(int n){
        return product[n-1];
    }
    public Product[] getAllProdect(){
        return product;
    }
}