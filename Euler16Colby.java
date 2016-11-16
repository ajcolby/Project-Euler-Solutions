// Euler problem 16 
// Austin Colby

import java.util.*;
import java.math.BigInteger;
import java.math.*;
import java.io.*;

public class Euler16Colby {
	
	public static void main(String[] args) {
	
		//big integer stuff to get the complete 2^1000 value 
		BigInteger [] store = new BigInteger[1000]; 	
		int i = 0; 
		BigInteger sum= new BigInteger("0");
		BigInteger value = new BigInteger("2");
		BigInteger bigValue = new BigInteger("0");
		double test = Math.pow(2,1000);
		bigValue = value.pow(1000);
		
		//try catch block to print bigValue out to file line by line
		try{
		PrintWriter writer = new PrintWriter("output.txt");
	
		while(test > 0){	
			store[i] = bigValue.mod(new BigInteger("10")); 
			bigValue = bigValue.divide(new BigInteger("10")); 
			test = test / 10;
			writer.println(store[i]);
			i++;
		}
		
		writer.close();
		
		}catch (Exception e){
			System.out.println("please make sure that output.txt was created");
		}
		
		//try catch to read file created and sum the lines
		try{
			FileReader file = new FileReader("output.txt");
			BufferedReader reader = new BufferedReader(file); 
			int finalSum = 0;
			String s; 
			while((s = reader.readLine()) != null) { 
				finalSum += Integer.parseInt(s);
			}
			System.out.println(finalSum);
		} catch(Exception ex){
			System.out.println("Error");
		}
	}
}

