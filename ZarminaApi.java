
/**
 * The <code>ZarminaApi</code> class represents mathematical equation.
 * Equation formula is to add the two numbers and the formula a+b=b+a,
 * are implemented as methods of this class.
 * @author Zarmina - 14SW165
 * @since JDK1.8
 */

public class ZarminaApi {
	/** These values are used for equation variable storage. */
	private float aSum;
	private float bSum;
	private float wResult;

	 /**
     * Uses the param values as a and b use to calculate the value of a+b in shot sum of both.
     * This method doesn't perform any range checking.
     * Both params are used to calculate summed up value 
     * @param      a     The first value to put into the formula.
     * @param      b     The second value to put into theformula.
     */
	public int additionTheorem(int a, int b) {
		this.aSum = a;
		this.bSum = b;
		this.wResult = this.aSum + this.bSum;
		return this.wResult
	}
}