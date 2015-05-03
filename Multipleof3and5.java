//Find the sum of all the multiples of 3 or 5 below 1000.
public class Multipleof3and5 {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1; i<1000; i++)
		{
			//check if multiple of 3 or 5
			boolean toAdd=checkInt(i);
			
			//if multiple, add value of i to sum
			if(toAdd==true){
				sum+=i;
			}
			else {
				//do nothing
			}
		}
		System.out.println("The sum of all multiples of 3 or 5 below 1000 is "+sum);
		
	}
	
	public static boolean checkInt(int i){
		if (i%3==0 || i%5==0)
		{
			return true;
		}
		else return false;
	}

}