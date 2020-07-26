package structPat;

public class Main {
	public static void main(String[] args) {
        Ani bDog = new Dog(3, 500, "Meat", new BDog());
        Ani smallDog = new Dog(2, 250, "Granules", new SmallDog());
      
        System.out.println(bDog.feed());
        smallDog.feed();
    }

}
