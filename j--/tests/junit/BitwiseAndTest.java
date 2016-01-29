package junit;

import junit.framework.TestCase;
import pass.BitwiseAnd;

public class BitwiseAndTest extends TestCase {
	private BitwiseAnd bitand;
	
	protected void setUp() throws Exception {
		super.setUp();
		bitand = new BitwiseAnd();
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testBitwiseAnd() {
		this.assertEquals(bitand.bitAnd(11, 2), 2);
		this.assertEquals(bitand.bitAnd(0, 29), 0);
		this.assertEquals(bitand.bitAnd(-32, 65), 64);
		this.assertEquals(bitand.bitAnd(-6, -14), -14);
	}
}
