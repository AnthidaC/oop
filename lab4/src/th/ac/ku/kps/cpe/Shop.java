package th.ac.ku.kps.cpe;
import java.util.*;
public class Shop {
	public static void main(String[] args) {
		ArrayList<Product> pAll = new ArrayList<Product>();
		pAll.add(new Product(0,"Mama",5.5));
		pAll.add(new Product(10,"Lays",10.5));
		Scanner input =new Scanner(System.in);

		System.out.println("======== Enter Products detail========");
		for(int i=20;i<=40;i+=10) {
			System.out.println("Product code "+i);
			System.out.printf("name : ");
			String n = input.nextLine();
			System.out.print("price : ");
			double p = input.nextDouble();
			input.nextLine();
			pAll.add(new Product(i,n,p));
		}
		System.out.println("========== List of Products ==========");
		for (Product product : pAll) {
			System.out.println("Product code "+product.getCode());
			System.out.print("name :"+product.getName());
			System.out.println(" , price :"+product.getPrice());
		}
		System.out.println("===== What do you want to buy? ======");
		System.out.println("Enter product code (press -1 to exit)");
		int money=0;
		for(int c=0;c!=-1;) {
			System.out.print("Product code :");
			c = input.nextInt();
			if(c==-1) break;
			System.out.print("Amount of Magnum:");
			int p =input.nextInt();
			for (Product product : pAll) {
				if(product.getCode()==c) {
					money+=product.getPrice()*p;
				}
			}
		}
		System.out.println("You have to pay "+money +" Bath");
		
	}
}
