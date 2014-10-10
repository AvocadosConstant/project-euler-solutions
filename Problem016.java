package projectEuler;

import java.math.BigInteger;

/**
 * Power digit sum
 * Problem 16
 * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * 
 * What is the sum of the digits of the number 2^1000?
 * @author Tim
 *
 */
public class Problem016 {

	public static void main(String[]args)
	{
		BigInteger n = BigInteger.valueOf(2);
		
		n = n.pow(1000);
		
		BigInteger sum = BigInteger.valueOf(0);
		
		while(n.compareTo(BigInteger.ONE) > -1)
		{
			sum = sum.add(n.mod(BigInteger.TEN));
			n = n.subtract(n.mod(BigInteger.TEN));
			n = n.divide(BigInteger.TEN);
		}		
		System.out.println(sum);
	}
}
