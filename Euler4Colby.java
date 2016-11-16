// Euler problem 4 
// Austin Colby

import java.util.*;

public class Euler4Colby {
	
	public static void main(String[] args) {
		
		int multi = 0; 
		StringBuffer multiString;
		int max = 0; 
		
		for(int i = 100; i <= 999; i++){
			for(int j = 100; j <= 999; j++){
				multi = i * j; 
				multiString = new StringBuffer(Integer.toString(multi));
				if(multi == Integer.parseInt(multiString.reverse().toString())){
					if(multi > max){
						max = multi;
					}
				}
			}
		}
			System.out.println("The biggest palindrome is: " +  max);
	}
}
