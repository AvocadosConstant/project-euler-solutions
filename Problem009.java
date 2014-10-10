package projectEuler;

/**
 * Special Pythagorean triplet
 * Problem 9
 * 
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *
 * a^2 + b^2 = c^2
 * 
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 * @author Tim
 *
 */
public class Problem009 {

	public static void main(String[]args)
	{
//		int a = 0;
//		int b = 0;
//		int c = 0;
		
		for(int a = 1; a <= 500; a++)
		{
			for(int b = 1; b <= 500; b++)
			{
				for(int c = 1; c <= 500; c++)
				{
					if(a*a + b*b == c*c && a+b+c == 1000) 
					{
						System.out.println("a = " + a + " | a^2 = " + a*a);
						System.out.println("b = " + b + " | b^2 = " + b*b);
						System.out.println("c = " + c + " | c^2 = " + c*c);
						int sum = a+b+c;
						System.out.println("a + b + c = " + sum);
						int product = a*b*c;
						System.out.println("a * b * c = " + product + "\n\n ---------------- \n");
					}
				}
			}
		}
	}
}