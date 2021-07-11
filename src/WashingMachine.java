
public class WashingMachine extends ElectronicDevice{
	private int speed;
	public WashingMachine(String brandname,int power, int ratings, int price, int speed){
		super(brandname,power, ratings, price);
		this.setSpeed(speed);
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
