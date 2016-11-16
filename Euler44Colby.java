// Euler problem 9 
// Austin Colby

import java.util.*;

public class Euler44Colby {
	
	public static void main(String[] args) {
		
		int[] p = new int[100000]; 
		int n; 
		
		for( n = 1; n < p.length; n++){
			p[n] = (n*((3*n)-1)) / 2; 
		}
		
		for(int i = 1; i < p.length; i++){
			for(int j = 1; j < p.length; j++){
				for(int k = 1; k < p.length; k++){
					if(p[i] + p[j] == p[k] && p[i] - p[j] == p[k]){
						System.out.println(p[i] - p[j]);
					}
				}
			}
		}
	}
}

