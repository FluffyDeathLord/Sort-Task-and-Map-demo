
public class TV extends ElectronicDevice{
	private int graphics;
	private int resolution;
	private String color;
	public TV(String brandname,int power, int ratings, int price, int graphics ,String color, int resolution1){
		super(brandname,power,ratings, price);
		this.graphics=graphics;
		this.resolution=resolution1;
		this.color=color;
}

private Memory memory;
private Bluetooth bluetooth;
public Bluetooth getBluetooth() {
	return bluetooth;
}
public void setBluetooth(Bluetooth bluetooth) {
	this.bluetooth = bluetooth;
}
public int getGraphics() {
	return graphics;
}
public void setGraphics(int graphics) {
	this.graphics = graphics;
}
public int getResolution() {
	return resolution;
}
public void setResolution(int resolution) {
	this.resolution = resolution;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}


public Memory getMemory() {
	return memory;
}
public void setMemory(Memory memory) {
	this.memory = memory;
}

}