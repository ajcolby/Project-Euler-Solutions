// Assignment 1
// Name: <Austin Colby>
// Section: <12>

public class Euler148Colby
{ 

	public static void main(String[] args){

  //variables
 int n  = Integer.parseInt(args[0]);
 double [][] tri = new double[120][120];
	

//master line, for without it the program will not work, for some reason!
tri[1][1] = 1;

//fills in the values for pascals triangle
for(int i = 2; i < (n + 3); i++){
   for(int j = 2; j < i; j++){
            tri[i][j] = tri[i - 1][j] + tri[i - 1][j - 1];
    }
}

//create triangle shape and placement
for(int i = 2; i < (n + 3); i++){
   for(int j = 2; j < i; j++){
            System.out.println(tri[i][j]);
    }
}
	}
}