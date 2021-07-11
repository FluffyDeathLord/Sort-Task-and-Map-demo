
public class AC extends ElectronicDevice 
{
	private int UnitNo;
	public  AC(String brandname,int power, int ratings, int price, int UnitNo){
		super(brandname,power, ratings, price);
        this.setUnitNo(UnitNo);
	}
	public int getUnitNo() {
		return UnitNo;
	}
	public void setUnitNo(int unitNo) {
		UnitNo = unitNo;
	}
}
