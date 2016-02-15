
import java.util.*;
/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

	a2 + b2 = c2
	For example, 32 + 42 = 9 + 16 = 25 = 52.

	There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	Find the product abc.
 * @author alisoncheu
 *
 */
public class Problem9 {
	static double[] result = new double[3]; 
   public static void main(String args[]) {
	   
	   int total = 1000; 
	   calculateABC(); 
	   System.out.println("A: " + Double.toString(result[0]));
	   System.out.println("B: " + Double.toString(result[1]));
	   System.out.println("C: " + Double.toString(result[2]));
	   double product = result[0] * result[1] * result[2]; 
	   System.out.println("Product is " + product);
   }
   
   /**
    * calculateABC function determines whether 
    */
   private static void calculateABC(){ 
	  double tempA, tempB;  
	   //triple for loops guarantees that a < b < c
	  int count =0; 
	  for(double c = 500; c >=3; c--){
		  for(double b = 499; b >= 2; b--){
			  for(double a = 498; a >= 1; a--){
				  tempA = Math.pow(a, 2);
				  tempB = Math.pow(b, 2);
				  if(tempA + tempB == Math.pow(c, 2)){ 
					  // the Pythagorean triplet holds true & check if equals to 1000
					  if(a + b + c == 1000.0){
						  result[0] = a; 
						  result[1] = b;
						  result[2] = c; 
						  return; 
					  }else; 
				  }else; 
			 }

		  }
	  }
   }
}
