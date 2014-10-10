package projectEuler;

/**
 * Sum square difference
 * Problem 6
 * 
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2  = 385
 * 
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 552 = 3025
 * 
 * Hence the difference between the sum of the squares of the first 
 * ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first 
 * one hundred natural numbers and the square of the sum.
 * @author Tim
 *
 */
public class Problem006 {

	public static void main(String[]args)
	{
		int limit = 100;
		int sumOfSquares = 0;
		int squareOfSum = 0;
		
		for(int i = 1; i <= limit; i++)
		{
			sumOfSquares += i*i;
			squareOfSum += i;
			//System.out.println("Sum of Squares : " + sumOfSquares + 
			//		" | Square of Sums : " + squareOfSum);
		}
		squareOfSum = squareOfSum*squareOfSum;
		
		int difference = squareOfSum - sumOfSquares;
		
		//System.out.println("Sum of Squares : " + sumOfSquares + 
		//		" | Square of Sums : " + squareOfSum + " | Difference : " + difference);
		System.out.println(difference);
	}
}
