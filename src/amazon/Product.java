package amazon;

public abstract class Product {
	
	protected String productName;
	protected String productId;
	public Product(String productName, String productId)
	{
		this.productName=productName;
		this.productId=productId;
		
	}

	public abstract double getPrice();
	public void displayDetails()
	{
		System.out.println("productname:"+productName);
		System.out.println("productId:"+productId);
	}
}
