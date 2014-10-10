package projectEuler;

/**
 * Largest prime factor
 * Problem 3
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143?
 * @author Tim
 *
 */
public class Problem003 {

	public static void main(String[]args)
	{
		long n = 600851475143L;
		long largestPrime = 0;
		for (long i = 2; i <= n; i++) 
		{ 
			if (n % i == 0) 
			{ 
				if(largestPrime < i) largestPrime = i;
				n /= i; 
				i--; 
			}
		}
		System.out.println(largestPrime);
	}
}
