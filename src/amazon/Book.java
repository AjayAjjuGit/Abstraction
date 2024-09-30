package amazon;

public class Book extends Product {
	
	protected String author;
	protected String ISBN;
	protected double price;
	public Book(String productName,String productId,String author,String ISBN,double price )
	{
		super(productName,productId);
		this.author=author;
		this.ISBN=ISBN;
		this.price=price;
		
	}
	public double getPrice()
	{
		return getPrice();
	}
	public void displaydetails() {
		super.displayDetails();
		System.out.println("AUTHOR:"+author);
		System.out.println("ISBN:"+ISBN);
		System.out.println("PRICE:"+price);
	}
	
	}
