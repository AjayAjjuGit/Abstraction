package amazon;

public class Electronics extends Product {
	protected String brand;
	protected String warrantyPeriod;
	protected double discount;
	public Electronics(String productName,String productId,String brand,String warrantyPeriod,double discount)
	{
		super(productName,productId);
		this.brand=brand;
		this.warrantyPeriod=warrantyPeriod;
		this.discount=discount;

	}
	public double getPrice()
	{
		return	getPrice();
		
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("brand:"+brand);
		System.out.println("warrantyPeriod:"+warrantyPeriod);
		System.out.println("discount:"+discount);
		
	}

}
