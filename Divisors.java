/**
 *2520 is the smallest number that can be divided 
 *by each of the numbers from 1 to 10 without any remainder.
 *What is the smallest positive number that is evenly divisible 
 *by all of the numbers from 1 to 20?
 *
 *Notes: Look at primes between 1 to 20
 *Primes: 2,3,5,7,11,13,17,19
 **/

public class Divisors{
	public static void main(String[] args){
		
		int[] arrayPrime = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int start=21;
		
		boolean smallNum=false;
		
		while(smallNum==false){
			smallNum=checkIfDivisible(start,arrayPrime);
			if(smallNum==false) start=start+1;
			else;
		}
		System.out.println("Smallest Number divided is " + start);
	}

	static boolean checkIfDivisible(int min,int[] array){
		int count=0;
		for(int i=0;i<array.length; i++)
		{
			if(min%array[i]==0){ 
				count++;
			}
		}
		if(count==array.length) return true;
		else	return false;
	}
}