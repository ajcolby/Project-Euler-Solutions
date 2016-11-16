// Euler problem 14
// Austin Colby

import java.util.*;
import java.math.BigInteger;
import java.math.*;
import java.io.*;

public class Euler14Colby {
	
	public static void main(String[] args) {
			
		long max = 0; 
		long number = 0; 
		
		for(int i =13; i <= 1000000; i++){
		long sum = 1 ; 
		long temp = i; 
			 while(temp!=1){
				if((temp%2) == 0){
					temp = temp/2; 	
				}else {
					temp = 3*temp + 1;
				}	
				sum++;
			}
			if(max < sum){
				max = sum;
				number = i;
			}
		}
			
		System.out.println("The longest chain starts at: " + number);
	}
}