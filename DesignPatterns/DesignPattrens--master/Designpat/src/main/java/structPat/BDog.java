package structPat;

public class BDog implements FeedingAPI{
	public String feed(int timesADay, int amount, String typeOfFood) {
        return "Feeding a big dog, " + timesADay + " times a day with " + 
            amount + " g of " + typeOfFood;

}
}