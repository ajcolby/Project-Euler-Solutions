// Euler problem 48 
// Austin Colby

import java.util.*;
import java.util.*;
import java.math.BigInteger;
import java.math.*;
import java.io.*;

public class Euler48Colby {
	
	public static void main(String[] args) {
	
		BigInteger sum = new BigInteger("0");
		
		 
		for(int i = 1; i <= 1000; i++){
			BigInteger temp = new BigInteger(i+ "");
			temp = temp.pow(i);
			 sum = sum.add(temp);
		}
		System.out.println("The last ten digits are: " + sum.mod(new BigInteger("10000000000")));
		
	}
}
