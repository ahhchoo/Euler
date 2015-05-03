/**
 * 10001st Prime
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
public class Problem7{
	
	public static void main (String[] args){
		int count=0;//count for number of Primes
		int prime=2;
		
		while(count<10001){
			boolean isPrime=testPrime(prime);
			if(isPrime==true){
				count++;
				if(count==10001) break;
				prime++;
			}
			else prime++;
		}
		
		System.out.println("10,0001th prime is"+ prime);
	}
	
	/**
	 * testPrime method determines whether parameter prime is a prime or not
	 * For loop iterates values from 1 to Prime value to determine number of factors
	 * Prime number=factors of 1 and itself <- test for this case 
	 * @param prime	value to be tested
	 * @return		returns whether value is prime or not as a boolean
	 */
	public static boolean testPrime(int prime){
		int factors=0;
		for(int i=1;i<=prime;i++){
			if(prime%i==0) factors++;
		}
		if(factors==2) return true;
		else return false;
	}
}
}