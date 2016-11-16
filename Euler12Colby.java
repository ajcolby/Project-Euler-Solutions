// Euler problem 12 
// Austin Colby

import java.util.*;
import java.math.BigInteger;
import java.math.*;
import java.io.*;

public class Euler12Colby {
		
	public static void main(String[] args) {
		int triangle = 1; //first triangle number
		int sum = 0; 
		int temp = 1;
	
		while(sum <=500){
			sum = 0;
			temp++;
			triangle = (temp * (temp+1))/2;
			
			for(int i = 1; i < Math.sqrt(triangle); i++){ //only check to sqrt due to running time
				if(triangle%i ==0){
					sum+=2; //add two since everything after sqrt will factor of below
				}
			}
			if(Math.sqrt(triangle)*Math.sqrt(triangle) == triangle){
					sum--; //correction factor
			}
		}
		System.out.println("The triangle number is: " + triangle);
	}
}
