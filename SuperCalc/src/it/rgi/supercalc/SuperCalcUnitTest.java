/**
 * 
 */
package it.rgi.supercalc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author academy1421r.01
 *
 */
public class SuperCalcUnitTest {
	private SuperCalc sc;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		sc = new SuperCalc();
		assertNotNull(sc);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		sc = null;
		assertNull(sc);
	}

	@Test
	public void testSum() {
		int op1 = 10, op2 = 30;
		int sum = sc.sum(op1, op2);
		
		assertEquals("Sum is not correct!!!", 40, sum);
	}

	@Test
	public void testSub() {
		int op1 = 40, op2 = 30;
		int sub = sc.sub(op1, op2);
		
		assertEquals("Sub is not correct!!!", 10, sub);
	}

	@Test
	public void testMul() {
		int op1 = 40, op2 = 30;
		int mul = sc.mul(op1, op2);
		
		assertEquals("Sub is not correct!!!", 1200, mul);
	}

}
