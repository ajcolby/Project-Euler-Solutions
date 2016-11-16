// Euler problem 3 
// Austin Colby
// this program will determine the prime factorization

import java.util.*;

public class Euler7Colby {
	
	public static void main(String[] args) {
		
		//variables
		int inputMax = 250000;
		int userInput = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[inputMax + 1];
		int[] primes = new int[inputMax]; 

		
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

		//loop through get primes and store in primes array 
		for(int j = 0; j < 20000; j++){
			for (int i = 2; i <= inputMax; i++) {
				if (isPrime[i]){
					primes[j] = i; 
					j++; 
				}
			}
        }
		//output desired prime
        System.out.println("The desired prime is: " + primes[userInput - 1]); // 10000 since array starts at 0 
	}
}
