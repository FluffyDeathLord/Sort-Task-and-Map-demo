import java.util.Comparator;


	public class SortBasedOnRatings implements Comparator<ElectronicDevice>
	{

		@Override
		public int compare(ElectronicDevice e1, ElectronicDevice e2) {
			
			return e1.getRatings() - e2.getRatings();
		}
			

	}

