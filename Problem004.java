package projectEuler;

/**
 * Largest palindrome product
 * Problem 4
 * 
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product 
 * of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the 
 * product of two 3-digit numbers.
 * @author Tim
 *
 */
public class Problem004 {

	public static void main(String[]args)
	{
		int largestPal = 0;
		for(int i = 999; i > 100; i--)
		{
			for(int j = 999; j > 100; j--)
			{
				int product = i*j;
				int reverse = 0;
				
				while (product != 0) 
				{
		            int remainder = product % 10;
		            reverse = reverse * 10 + remainder;
		            product = product / 10;
		        }
				if(i*j == reverse && largestPal < i*j) 
				{
					largestPal = i*j; 
					System.out.println(i + " * " + j + " = " + i*j);
				}
			}
		}
		System.out.println(largestPal);
	}
}
