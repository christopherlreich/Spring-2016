package junit;

import junit.framework.TestCase;
import pass.BitwiseOr;

public class BitwiseOrTest extends TestCase {
	private BitwiseOr bit;
	
	protected void setUp() throws Exception {
		super.setUp();
		bit = new BitwiseOr();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testBitwiseOr() {
		this.assertEquals(bit.bitwiseOr(1, 45), 45);
		this.assertEquals(bit.bitwiseOr(0, 11), 11);
		this.assertEquals(bit.bitwiseOr(22, -34), -34);
		this.assertEquals(bit.bitwiseOr(-7, -3), -3);
		this.assertEquals(bit.bitwiseOr(0, 1), 1);
	}
}
