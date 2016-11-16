// Euler problem 9 
// Austin Colby

import java.util.*;

public class Euler9Colby {
	
	public static void main(String[] args) {
		
		int a, b, c; 
		
		for(c = 0; c < 1000; c++){
			for(b = 0; b < 1000; b++){
				for(a = 0; a < 1000; a++){
					if((a*a)+(b*b) == (c*c) && (a + b + c) == 1000){
						System.out.println("The value is: " + a*b*c);
						System.exit(1); //1 denotes that the if statement is true. 
					}
				}
			}
		}
	
	}
}
