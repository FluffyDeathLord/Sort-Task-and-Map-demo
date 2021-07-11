
public class Memory{
	
	private String brandname;
	private int price;
	private int ratings;
    public Memory(String  brandname,int price, int ratings){
    	super();
    	this.brandname=brandname;
    	this.price=price;
    	this.ratings=ratings;
    	
    }
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
    }