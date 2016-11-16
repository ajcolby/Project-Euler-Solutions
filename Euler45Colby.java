// Euler problem 45
// Austin Colby

import java.util.*;
import java.math.BigInteger;
import java.math.*;
import java.io.*;

public class Euler45Colby {
		
	public static void main(String[] args) {
		
		long[] triangle = new long[10000000]; 
		long[] pentagonal = new long[10000000];
		long[] hexagonal = new long[1000000];
	
		 triangle[0] = 1; //first triangle number
		 pentagonal[0] = 1; //first pentagonal number
		 hexagonal[0] = 1; //first Hexagonal number
		
		for(int i = 1; i < triangle.length; i++){ 
			triangle[i] = (i * (i+1))/2;
			if(triangle[i] == 1533776805){
				System.out.println("i " +  i);
			}
		}
		
		for(int j = 1; j < pentagonal.length; j++){ 
			pentagonal[j] = (j * (3*j-1))/2;
			if(pentagonal[j] == 1533776805){
				System.out.println("j " + j);
			}
		}
		
		for(int k = 1; k < hexagonal.length; k++){ 
			hexagonal[k] = k * (2*k-1);
			if(hexagonal[k] == 1533776805){
				System.out.println("k " + k);
			}
		}
	}
}
