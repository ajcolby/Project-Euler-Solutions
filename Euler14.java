// Euler problem 14
// Austin Colby

import java.util.*;
import java.math.BigInteger;
import java.math.*;
import java.io.*;

public class Euler14Colby {
		
	public static void main(String[] args) {
		
		int sum = 0; 
		int max = 0;
		
		for(int i=1; i < 1000000; i++){
		boolean b = true; 
			while(b){
				if(i%2 == 0){
					i = i/2; 
					sum++;
				}else 
					i = 3*i + 1;
					sum++;
				}
				if(i ==1){
					b = false;
				}
				if(max < sum){
					max = sum;
				}
			}
			System.out.println(max);
		}
	}
}