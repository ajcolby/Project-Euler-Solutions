//Austin Colby
//Euler 19

import java.util.*;

public class Euler19Colby{

	  public static void main(String args[]) {
		int total = 0;
		int year = 1901; 
		int day = 1; 
		int month = 1;
		
		Calendar c = Calendar.getInstance();
			
		while(year <= 2000){
			for (month = 1; month <=12; month++){
				c.set(year, month, day);
				int sunday = c.get(Calendar.DAY_OF_WEEK);
				if(sunday == 1){
					total++;
				}
			}
			year++;
		}
		
		System.out.println("There were a total of " + total + " Sundays.");
		
	  }   
}