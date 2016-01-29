package junit;

import junit.framework.TestCase;
import pass.Modulo;

public class ModuloTest extends TestCase {
	private Modulo modulo;

	protected void setUp() throws Exception {
		super.setUp();
		modulo = new Modulo();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
		
	}
	
	public void testModulo() {
		this.assertEquals(modulo.modulus(50, 1), 0);
		this.assertEquals(modulo.modulus(25, 2), 1);
		this.assertEquals(modulo.modulus(100, 52), 48);
	}

}
