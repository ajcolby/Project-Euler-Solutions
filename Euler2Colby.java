// Assignment 1
// Name: <Austin Colby>
// Section: <12>

public class Euler2Colby
{ 
	public static void main(String[] args){
	
	int[] fib = new int[4000000];
	int sum = 0; 
	
	fib[1] = 1;
	fib[2] = 1; 
	int j = 1; 
	
	for(int i = 3; i < 4000000; i++){
		fib[i] = fib[i-1] + fib[i-2]; 
	}
		
	while(fib[j] < 4000000){
		if(fib[j]%2 == 0){
			sum = sum + fib[j]; 
		}
		j++;
	}
		
		System.out.println(sum);
	
	}
}