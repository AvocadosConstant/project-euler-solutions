package projectEuler;

/**
 * Even Fibonacci numbers
 * Problem 2
 * 
 * Each new term in the Fibonacci sequence is generated by 
 * adding the previous two terms. By starting with 1 and 2, 
 * the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose 
 * values do not exceed four million, find the sum of the even-valued terms.
 *
 * @author Tim
 *
 */
public class Problem002 {
	
	public static void main(String[]args)
	{
		int limit = 4000000;
		int evenSum = 0;
		int n = 0;
		int m = 1;
		int temp = 0;
		
		while(n < limit)
		{
			temp = m;
			m = n + m;
			n = temp;
			if(n % 2 == 0) evenSum+=n;
		}
		System.out.println(evenSum);
	}

}
