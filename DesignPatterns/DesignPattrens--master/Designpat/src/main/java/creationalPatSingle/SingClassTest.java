package creationalPatSingle;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingClassTest {

	@Test
	public void test() {
		SingClass s=new SingClass();
		assertEquals("I'm a singleton object!",s.showMessage());
	}

}

