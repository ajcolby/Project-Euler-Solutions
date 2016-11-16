// Euler problem 10
// Austin Colby
// this program will determine the prime factorization

import java.util.*;

public class Euler10Colby {
	
	public static void main(String[] args) {
		
		//variables
		int inputMax = 2000000;
        boolean[] isPrime = new boolean[inputMax + 1];
		
		//loop to set all ints to true
        for (int i = 2; i <= inputMax; i++) {
            isPrime[i] = true;
        }

        //Sieve of Eratosthenes
        for (int i = 2; i*i <= inputMax; i++) {
            if (isPrime[i]) {
                for (int j = i; i*j <= inputMax; j++) {
                    isPrime[i*j] = false;
                }
            }
        }

		long sum = 0; 
		//loop through add primes
			for (int i = 0; i <= inputMax; i++) {
				if (isPrime[i]){
					sum += i;
				}
			}
        
		
		System.out.println("The sum is: " + sum);
	}
}//completed works
