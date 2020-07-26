package creationPatAbsFac;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemTest {

	@Test
	public void test() {
		Dem dOb=new Dem();
		assertEquals("Inside Rectangle::draw() method.",dOb.main(false, "Rectangle"));
	}
	@Test
	public void test1() {
		Dem dOb=new Dem();
		assertEquals("Inside Square::draw() method.",dOb.main(false, "SQUARE"));
	}
	@Test
	public void test12() {
		Dem dOb=new Dem();
		assertEquals("Inside RoundedRectangle::draw() method.",dOb.main(true, "Rectangle"));
	}
	@Test
	public void test13() {
		Dem dOb=new Dem();
		assertEquals("Inside RoundedSquare::draw() method.",dOb.main(true, "SQUARE"));
	}
}
