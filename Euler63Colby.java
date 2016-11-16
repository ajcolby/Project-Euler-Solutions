// Euler problem 63 
// Austin Colby
// this program will determine the prime factorization

import java.util.*;

public class Euler63Colby {

	public static void main(String[] args) {
		
		int sum = 0; 
		int len = 0; 
		
		for(int i = 0; i < 100; i++){
			for(int j = 0; j < i; j++){
				len = j * i; 
				String temp = Integer.toString(len);
				if(temp.length() == i){  
					sum+= 1;
				}
			}
		}
		
		System.out.println(sum);
	}
}
