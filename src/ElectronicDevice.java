
public class ElectronicDevice {
	String brandname;
	int price;
	int power;
	int ratings;
	public ElectronicDevice(){
		}
	public ElectronicDevice(String  brandname,int price,int power, int ratings){
		this.brandname=brandname;
		this.power=power;
		this.price=price;
		this.ratings=ratings;
	}

	
	
	
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
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
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
}
