/*Daniel Zheng
 * September 6, 2017
 *This is the runner for the calculate library. It is used to test the methods in Calculate.
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(-2));
		System.out.println(Calculate.cube(4));
		System.out.println(Calculate.average(3.2,4.0));
		System.out.println(Calculate.average(1.0,2.0,3.0));
		System.out.println(Calculate.toDegrees(2.5));
		System.out.println(Calculate.toRadians(180));
		System.out.println(Calculate.discriminant(4.0, 3.0, 2.0));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2,  3,  6,  -7, "n"));
		System.out.println(Calculate.isDivisibleBy(10, 2));
		System.out.println(Calculate.absValue(-3.6));
		System.out.println(Calculate.max(39, 2));
		System.out.println(Calculate.max(21.5, -5, 20));
		System.out.println(Calculate.min(-1, 1));
		System.out.println(Calculate.round2(1.234567));

	}

}
