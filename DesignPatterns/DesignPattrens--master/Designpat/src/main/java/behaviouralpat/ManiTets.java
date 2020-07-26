package behaviouralpat;
import static org.junit.Assert.*;


import org.junit.Test;

public class ManiTets {
	private InterpreterEngine engine;
	
	@Test
	public void testInterpret() {
		Mani m=new Mani(engine);
		/*assertEquals(20,m.interpret("add 5 and 15"));*/
	}
}