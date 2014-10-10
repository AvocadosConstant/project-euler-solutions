package projectEuler;

import java.util.ArrayList;

/**
 * 10001st prime
 * Problem 7
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 
 * 11, and 13, we can see that the 6th prime is 13.
 * 
 * What is the 10001st prime number?
 * @author Tim
 *
 */
public class Problem007 {
	
	public static void main(String[]args)
	{
		int limit = 100;
		int n = 2;
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		for(int i = 2; i <= limit ; i++)
		{
			System.out.println("i is " + i);
			boolean isNotPrime = true;
			while(isNotPrime)
			{
				for(int j = 2; j < i; j++)
				{
					if(i % j == 0)
					{
						isNotPrime = true;
					}
				}
				if(i == 2) 
				{
					isNotPrime = false;
					primes.add(i);
				}
				//n++;
			}
		}
		for(int i = 0; i < primes.size(); i++)
		{
			System.out.println("The " + i + "th prime is " + primes.get(i));
		}
	}
}
