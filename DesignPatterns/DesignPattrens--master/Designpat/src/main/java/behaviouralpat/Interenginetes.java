package behaviouralpat;

import static org.junit.Assert.*;

import org.junit.Test;

public class Interenginetes {

	@Test
	public void test() {
		InterpreterEngine i=new InterpreterEngine();
		assertEquals(40,i.add("add 28 and 39"));
	}
	@Test
	public void testMul() {
		InterpreterEngine i=new InterpreterEngine();
		assertEquals(25,i.multiply("multiply 10 and 10"));
	}


}
