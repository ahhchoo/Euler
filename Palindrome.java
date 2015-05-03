/**
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Palindrome
{
	public boolean isPalindrome(int num){
		int array[] = new int[10];
		int count=0;
		
		//breaks down product into array of digits
		while(num>=1){
			int digit=num%10;
			num=num/10;
			array[count]=digit;
			count=count+1;
		}
		
		//if array is even, possibly palindrome -> test
		if (count%2==0){
			boolean test=compareArray(count, array);
			return test;
		}
		else return false;
	}

	public boolean compareArray(int count, int[] array)
	{
		for(int i=0, k=count-1;i<count/2;i++,k--)
		{
			if(array[i]==array[k]);
			else return false;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		Palindrome p= new Palindrome();
		
		boolean value=false;
		int product=0;
		//array to store palinedromes
		int max=0;
		
			//iterates through firstFactor
		for(int firstFactor=999; firstFactor>=100; firstFactor--)
		{
			//iterates through secondFactor
			for(int secondFactor=firstFactor;secondFactor>=100;secondFactor--)
			{
				product=firstFactor*secondFactor;
				value= p.isPalindrome(product);
				if(value==true){
					if(max<product) max=product;
				}
				else;
			}
		}

		System.out.println("Largest Palindrome is " + max);
	}

}