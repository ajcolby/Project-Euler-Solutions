// Euler problem 5 
// Austin Colby

import java.util.*;

public class Euler5Colby {
	
	public static void main(String[] args) {
		
		int j; 
		
		for(j = 100000000; j < 1000000000; j++){
			if(
			j%1 == 0 && j%2 == 0 && j%3 == 0 && j%4 == 0 
			&& j%5 == 0 && j%6 == 0 && j%7 == 0 
			&& j%8 == 0 && j%9 == 0 && j%10 == 0 
			&& j%11 == 0 && j%12 == 0 && j%13 == 0 
			&& j%14 == 0 && j%15 == 0 && j%16 == 0 
			&& j%17 == 0 && j%18 == 0 && j%19 == 0 
			&& j%20 == 0	
			) {
				System.out.println("The smallest value evenly divisible by 1 - 20 is: " + j);
				break;
			}
		}
	}
}//completed works
