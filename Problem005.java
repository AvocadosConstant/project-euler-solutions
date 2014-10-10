package projectEuler;

/**
 * Smallest multiple
 * Problem 5
 * 
 * 2520 is the smallest number that can be divided by 
 * each of the numbers from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly 
 * divisible by all of the numbers from 1 to 20?
 * @author Tim
 *
 */
public class Problem005 {
	
	public static void main(String[]args)
	{
		int n = 0;
		int limit = 20;
		boolean test = true;
		while(test)
		{
			n++;
			for(int i = 1; i <= limit; i++)
			{
				if(n % i != 0) 
				{
					//System.out.println(n + "%" + i + "=" + n % i);
					break;
				}
				if(i == limit) test = !test;
			}
		}
		System.out.println(n);
	}

}
