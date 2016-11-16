// Euler problem 46 
// Austin Colby
// this program will determine the prime factorization

import java.util.*;

public class Euler46Colby {
	
	public static boolean isPrime(int a){
		int ans  = 0; 
		int i = 2; 
	
		//loop for prime calculation 
			while ( i <= a / 2)
			{
				if (a % i == 0)
				{
					ans = 1;
				}
			i++;
			}
			//if statement to display answer 
			if (ans == 1) {
				return false; 
			} else {
				return true; 
			}		
	
	}
	
	public static void main(String[] args) {
			
		int[] composites = new int[600];	
		int[] primes = new int[503];	
			
		for(int i = 2; i < 1000; i++){
			if(isPrime(i) == false){
				composites[i] = i;
			}else{
				primes[i] = i;
			}
		}
		
		for(int j = 2; j < composites.length; j++){
			for(int k = 1; j < composites.length; k++){
				if((composites[j] == primes[j] + 2*(k*k)) == true){
					continue;
				}else{
					System.out.println(composites[j]);
				}
			}
		}
		
	}
}
