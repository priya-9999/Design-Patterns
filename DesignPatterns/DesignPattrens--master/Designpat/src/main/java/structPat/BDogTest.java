package structPat;

import static org.junit.Assert.*;

import org.junit.Test;

public class BDogTest {

	@Test
	public void test() {
		BDog b=new BDog();
		assertEquals("Feeding a big dog, 3 times a day with 500 g of Meat",b.feed(3, 500, "Meat"));
	}

}
