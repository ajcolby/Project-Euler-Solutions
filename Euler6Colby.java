// Euler problem 6 
// Austin Colby

import java.util.*;

public class Euler6Colby {
	
	public static void main(String[] args) {
		
		int sum1 = 0; 
		int sum2 = 0;
		int temp = 0; 
		for(int i = 1; i <= 100; i++){
			sum1 += (i*i);
		}
		for(int j = 1; j <= 100; j++){ 
			temp += j;
			sum2 = (temp * temp); 
		}
		
		System.out.println("The difference is: " + (sum2-sum1));
	}
}//completed works
