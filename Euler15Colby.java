// Name: <Austin Colby>
// Euler 15

import java.util.*;
import java.math.*;
import java.io.*;

public class Euler15Colby{ 

	public static BigInteger factorial(int n) {
       BigInteger fact = new BigInteger("1");
       for (int i = 1; i <= n; i++) {
           fact = fact.multiply(new BigInteger(i + ""));
       }
		return fact;
   }

	public static void main(String[] args){
		//binomial coeffient problem 
		//so (a+b) choose a 
		// a = 20 , b = 20 so 40 choose 20
	

			
			BigInteger a = factorial(20);
			BigInteger b = factorial(20);
			BigInteger c = factorial(40);
			BigInteger d = a.multiply(b);
			
			BigInteger paths =  c.divide(d);
			
			
			System.out.println("The number of paths is: " + paths);
	}
			
}
