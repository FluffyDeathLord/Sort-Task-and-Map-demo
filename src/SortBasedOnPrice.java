
import java.util.Comparator;


public class SortBasedOnPrice implements Comparator<ElectronicDevice>
{

	@Override
	public int compare(ElectronicDevice e1, ElectronicDevice e2) {
		
		return e1.getPrice() - e2.getPrice();
	}
		

}