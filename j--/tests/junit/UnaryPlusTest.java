package junit;

import junit.framework.TestCase;
import pass.UnaryPlus;

public class UnaryPlusTest extends TestCase {
	
	private UnaryPlus unary;
	
	protected void setUp() throws Exception {
		super.setUp();
		unary = new UnaryPlus();
		
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
		
	}
	
	public void testUnaryPlus() {
		this.assertEquals(unary.unaryPlus(5), 5);
		this.assertEquals(unary.unaryPlus(-10), -10);
		this.assertEquals(unary.unaryPlus(0), 0);
	}
}
