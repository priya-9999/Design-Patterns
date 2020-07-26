package structPat;

import static org.junit.Assert.*;

import org.junit.Test;

public class DogTest {
	@Test
	public void testDog() {
		Dog dt=new Dog(3, 500, "Meat", new BDog());
	}
	@Test
	public void testFeed() {
		Dog d=new Dog(3, 500, "Meat", new BDog());
		assertEquals("Feeding a big dog, 3 times a day with 500 g of Meat",d.feed());
		}
	}

