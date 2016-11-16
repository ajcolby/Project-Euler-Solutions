// Euler problem 3 
// Austin Colby
// this program will determine the prime factorization

import java.util.*;

public class Euler3Colby {

	public static void main(String[] args) {
		
		System.out.println();
		System.out.print("Please enter a number: ");
		
		//variables 
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong(); 
		
		 
		System.out.println();
		System.out.print("The prime factorization is: ");
	
		//loop for prime calculation 
		
		//if(isPrime(a) == false){
			for (long i = 2; i  <= a; i++) {
				while (a % i == 0) {
				System.out.print(i + " ");
				a /= i; 
				}
			}
		//} else { 
		//	System.out.print( a + " 1"); 
		//}
		System.out.println();
		System.out.println("The largest Value is the last listed.");
	}
}
