import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainClass {
	public static void main(String[] args) {
		Map<String,List<ElectronicDevice>> electMap= new HashMap<>();
		ElectronicDevice L1= new Laptop("Lenovo",800,300,400,100,200, "Blue","Windows");
		ElectronicDevice L2= new Laptop("dell",700,200,450,200,100, "Black","Windows");
		ElectronicDevice L3= new Laptop("hp",900,350,500,250,250, "White","Windows");
		List<ElectronicDevice> laptopList = new ArrayList<>();
		laptopList.add(L1);
		laptopList.add(L2);
		laptopList.add(L3);
		electMap.put("Laptop", laptopList);
		
		ElectronicDevice M1= new Mobile("Motorola",999,300,650,930,"Silver", 279,"Android");
		ElectronicDevice M2= new Mobile("MI",899,200,630,970,"Blue", 290,"Android");
		ElectronicDevice M3= new Mobile("samsung",799,400,680,980,"Red", 379,"Android");
		List<ElectronicDevice> mobileList = new ArrayList<>();
		mobileList.add(M1);
		mobileList.add(M2);
		mobileList.add(M3);
		electMap.put("Mobile", mobileList);
		
		ElectronicDevice AC1=new AC("Lloyd",500,300,600,21);
		ElectronicDevice AC2=new AC("samsung",560,400,900,23);
		ElectronicDevice AC3=new AC("whirlpool",700,370,800,22);
		List<ElectronicDevice> acList = new ArrayList<>();
		acList.add(AC1);
		acList.add(AC2);
		acList.add(AC3);
		electMap.put("AC", acList);
		
		Iterator<String>itr= electMap.keySet().iterator();
		while(itr.hasNext())
		{
			String productName= itr.next();
			
			if(productName.equals("AC"))
			{
				List<ElectronicDevice>product=electMap.get(productName);
				for(ElectronicDevice device :product ){
					if(device.getPrice()>=600 && device.getPrice()<=800)
					{
						System.out.println(device.brandname);
					}
				}
			}
		}
		
		
		Collections.sort(acList, new SortBasedOnRatings());
		toPrint(acList, "Sorted based on ratings");
		System.out.println("=================================================");

		Collections.sort(acList, new SortBasedOnPrice());
		toPrint(acList, "Sorted based on Price");
		
		
	}	
		
	private static void toPrint(List<ElectronicDevice> collection, String string) {
		
		System.out.println("\n*********************"+string+"****************************");
		
		for (ElectronicDevice device : collection){
			System.out.println(device.brandname);
		}

		}
}

	