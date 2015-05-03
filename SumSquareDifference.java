/**
 * Sum Square Difference
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 * 
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * 
 * Hence the difference between 
 * the sum of the squares of the first ten natural numbers 
 * and the square of the sum is 3025 − 385 = 2640.
 * 
 * Find the difference 
 * between the sum of the squares of the first one hundred natural numbers 
 * and the square of the sum.
 */

public class SumSquareDifference{

	public static void main (String[] args){
		double sumSquare=0, squareHundred=0;
		for(int i=1;i<=100;i++)
		{
			sumSquare=sumSquare+i;//adds i to sum
			squareHundred=squareHundred+Math.pow(i,2);//adds square of i to sum
		}
		
		sumSquare=Math.pow(sumSquare,2);//squares sum of 1st 100 natural numbers

		double difference=sumSquare-squareHundred;
		System.out.println("Difference btwn Sum of Squres of 1st Hundred and Square of Sum is "+ difference );
	}
	
}