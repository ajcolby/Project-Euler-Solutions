// Euler problem 13 
// Austin Colby


import java.util.*;
import java.math.BigInteger;
import java.math.*;
import java.io.*;

public class Euler13Colby {
	
	public static void main(String[] args) {

	BigInteger[]  a = new BigInteger[101];
	BigInteger sum = new BigInteger("0");
	
	try{
		BufferedReader reader = new BufferedReader(new FileReader("euler13in.txt"));
		String line = null;
		int i = 0;
		while ((line = reader.readLine()) != null){
			a[i] = new BigInteger(String.valueOf(line)); 
			 sum = sum.add(a[i]);
			i++;
		}
	} catch(Exception e){
	
	}
	
		System.out.println("The sum is: \n" + sum);
	
	}
}
