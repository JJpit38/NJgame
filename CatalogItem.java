//package Package3;
// Abstract super class
public abstract class CatalogItem {
	private String title;
	private Double price;
	
	public CatalogItem(String title, Double price)
	{
		this.title= title;
		this.price= price;
	}
	
	public String getTitle() {
		return this.title;
		
	}
	public double getPrice()
	{
		return this.price;
	}
	public abstract String toString();
	
}
