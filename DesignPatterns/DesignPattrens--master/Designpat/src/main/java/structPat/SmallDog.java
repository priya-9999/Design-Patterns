package structPat;

public class SmallDog implements FeedingAPI {

	public String feed(int timesADay, int amount, String typeOfFood) {
		// TODO Auto-generated method stub
		 return "Feeding a big dog, " + timesADay + " times a day with " + 
         amount + " g of " + typeOfFood;
	}

}
