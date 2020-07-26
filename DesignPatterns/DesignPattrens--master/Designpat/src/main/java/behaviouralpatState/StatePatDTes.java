package behaviouralpatState;

import static org.junit.Assert.*;

import org.junit.Test;

public class StatePatDTes {

	@Test
	public void test() {
		StatePatD S=new StatePatD();
		assertEquals("Player is in start stateStart State",S.get());
	}
	@Test
	public void test1() {
		StatePatD S=new StatePatD();
		assertEquals("Player is in stop stateStop State",S.Stop());
	}

}
