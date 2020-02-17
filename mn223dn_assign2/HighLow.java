package mn223dn_assign2;

import java.util.*;

public class HighLow {

	public static void main(String[] args) {
      Random rand = new Random();
      Scanner guess = new Scanner(System.in);
      
      int random= rand.nextInt(101);
      
      System.out.print("Guess 1: ");
      
      int g = guess.nextInt();
      
      int i = 1;
      
      while ( random != g && i <= 9 ){
    	  
    	  if ( g < random && g >= 0 )
     	  System.out.println("Higher");
    	  else if (g > random && g <= 100 )
     	  System.out.println("Lower");
    	  else if (g < 0 || g > 100 )
    	  System.out.println("The guess value should be between 0 - 100");  
    
    	  i++;
    	  System.out.print("Guess "+i+": ");
    	  g = guess.nextInt();    	    	  
      }
      
      if (g == random)
   	  System.out.println("Correct answer after "+i+" guesses – Excellent!");
      
      else if (i >= 10)
       	  System.out.println("Game Over!");

		guess.close();
	}
}
