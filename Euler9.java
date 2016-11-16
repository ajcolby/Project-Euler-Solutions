// Euler problem 3 
// Austin Colby
// cs 3653
// this program will determine the prime factorization

import java.util.*;

public class Euler9Colby {
	
	public static void main(String[] args) {
		
		int a, b, c; 
		
		for(a = 0; a < 100; a++){
			for(b = 0; b < 100; b++){
				for(c = 0; c < 100; c++){
					if((a*a)+(b*b) == (c*c) && (a + b + c) == 1000){
						System.out.println(a*b*c);
					} else{
						continue;
					}
				}
			}
		}
	
	}
}
