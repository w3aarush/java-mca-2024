import java.util.Scanner;
class Product
{
	String pname;
	float price, dis, np;
	Scanner in = new Scanner(System.in);
	void inputproduct()
	{
		try
		{
			System.out.println("Enter product name:");
			pname = in.nextLine();
			System.out.println("Enter product price:");
			price = in.nextFloat();
			System.out.println("Enter discounted percent:");
			dis = in.nextFloat();
		}
		catch(Exception e1)
		{
			System.out.println(e1.toString());
		}
		finally
		{
			System.out.println("Try Again");
		}
	}

	void productsummary() {
		try
		{
			float disamt = (price * (dis/100));
			np = (price-disamt);
			System.out.println("Product Name : " + pname);
			System.out.println("Price : " + price);
			System.out.println("Discount Amount : " + disamt);
			System.out.println("Discount : " + dis);
			System.out.println("Net Amount : " + np);
		}
		catch(Exception e1)
		{
			System.out.println(e1.toString());
		}
		finally
		{
			System.out.println("Thank You, Visit Again");
		}
	}
}

class Question01 {
	public static void main(String[] args) {
		Product p1 = new Product();
	    p1.inputproduct();
	    p1.productsummary();
	}
}