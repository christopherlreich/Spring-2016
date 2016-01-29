package junit;

import junit.framework.TestCase;
import pass.ExclusiveOr;

public class ExclusiveOrTest extends TestCase {
	private ExclusiveOr exor;
	
	protected void setUp() throws Exception {
		super.setUp();
		exor = new ExclusiveOr();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testExclusiveOr() {
		this.assertEquals(exor.exOr(1, 5), 4);
		this.assertEquals(exor.exOr(0, 9), 9);
		this.assertEquals(exor.exOr(-8, 6), -2);
		this.assertEquals(exor.exOr(-3, -7), 4);
	}
}
