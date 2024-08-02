package lab6;

public class Cashier {
	   private String name;
	    
	    public Cashier(String n){
	        this.name=n;
	    }
	    public void printReceipt(InventoryCart n){
	        System.out.println("\tPumpkin Shop ("+name+")");
	        double num=0;
	        Product pp[]=n.getAllProdect();
	        int o=1;
	        for(int i=0;pp[i]!=null;i++){
	            for(int l=0;pp[l]!=null;l++) {
	            	if(pp[i].getName()==pp[l].getName()&&i<l) {
	            		o++;
	            	}
	            	else if(pp[i].getName()==pp[l].getName()&&i>l) {
	            		o=0;
	            		break;
	            	}
	            }
	            if(o>0) {
	            System.out.println(o+" x "+pp[i].getName()+" "+pp[i].getVolumn()+"  "+pp[i].getCode()+"\t"+pp[i].getPrice());
	            num+=pp[i].getPrice()*o;
	            }
	        }
	        System.out.println("\t\t---------------");
	        System.out.println("\t\t\tTotal\t"+num+"$");
	    }
	}
