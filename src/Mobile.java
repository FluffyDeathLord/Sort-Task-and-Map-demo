
public class Mobile extends ElectronicDevice{
	private int graphics;
	private int resolution;
	private String color;
	private String OS;
	public Mobile(String brandname,int power, int ratings, int price, int graphics, String color, int resolution1, String OS){
		super(brandname,power, ratings, price);
		this.graphics=graphics;
		this.resolution=resolution1;
		this.color=color;
		this.OS=OS;
}
	private Camera camera;
	
	public Camera getCamera() {
		return camera;
	}
	public void setCamera(Camera camera) {
		this.camera = camera;
	}
	private Memory memory;
	public Memory getMemory() {
		return memory;
	}
	public void setMemory(Memory memory) {
		this.memory = memory;
	}
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
	public String getOS() {
		return OS;
	}
	public void setOS(String oS) {
		OS = oS;
	}
}
