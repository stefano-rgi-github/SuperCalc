/**
 * 
 */
package it.rgi.supercalc;

/**
 * @author academy1421r.01
 *
 */
public class SuperCalc {
	private int ret;

	/**
	 * 
	 */
	public SuperCalc() {
		// TODO Auto-generated constructor stub
	}
	
	public int sum(int op1, int op2) {
		ret = op1+op2;
		return ret;
	}

	public int sub(int op1, int op2) {
		ret = op1-op2;
		return ret;
	}

}
