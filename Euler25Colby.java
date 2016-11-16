//Austin Colby
//Euler 25

import java.util.*;
import java.math.BigInteger;
import java.math.*;
import java.io.*;

public class Euler25Colby {
	
	 public static void main(String[] args) {
		// Binet's Fibonacci number formula
		// fib(n) = phi^n/sqr(5)
		// phi^n/ sqr(5) > 10^999(1000 digits)
		// n > log_phi( sqr(5)*10^999)
		// n = log_phi(10) * (log(sqr(5)) + 999)
		// phi = 1.618033..... Golden ratio 
		
		double phi = 1.618033;
		double fib = (Math.log(10) / Math.log(phi)) * (Math.log10(Math.sqrt(5))+999); ;
		
		System.out.println("The value is: " + Math.round(fib));
	 }
}