package lab7_2;

public class Cashier {
	   private String name;
	   private InventoryCart n;
	   private Card card;

	    public void doPayment(InventoryCart n,Card card) {
	    	this.n=n;
	    	this.card=card;
	    }
	    public void printReceipt(){
	        System.out.println("\tCARD TYPE: "+card.type());
	        DebitCard debit = (DebitCard) card;
	        System.out.println("CARD NUMBER:"+debit.getAccound().getOwner().getSecurityNumber());
	        System.out.println("\n\tPumpkin Shop");
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
	        System.out.println("\t\t---------------\n");
	        System.out.println("CARD DISCOUNT "+debit.discount()+" %");
			card.withdraw((num-(num*debit.discount()/100)));
	        System.out.println("\t\t\tTotal\t"+(num-(num*debit.discount()/100))+"$");
	    }
	}
