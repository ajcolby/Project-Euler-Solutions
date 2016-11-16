// Euler problem 97 
// Austin Colby

import java.util.*;
import java.math.BigInteger;
import java.math.*;
import java.io.*;

public class Euler97Colby {
	
	public static void main(String[] args) {
	
		BigInteger value = new BigInteger("2");
		int bigValue = 7830457;
		BigInteger coeff = new BigInteger("28433");
		BigInteger one = new BigInteger("1");
		BigInteger power =  value.pow(bigValue);
		BigInteger multi =  power.multiply(coeff);
		BigInteger finalValue = multi.add(one);
		BigInteger mod = new BigInteger("10000000000");
		
		System.out.println(finalValue.mod(mod));
		
	}
}

