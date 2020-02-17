package mn223dn_assign1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Convert {
      public static void main(String[] args){
      	  Scanner input= new Scanner(System.in);
    	  
    	  System.out.print("Fahrenheit: ");
    	  
    	  double f=input.nextDouble();
    	  
    	  double c= (f-32)*5/9;
    	  
    	  DecimalFormat decimal= new DecimalFormat("0.#");
    	  String cOneDecimal= decimal.format(c);
    	  
    	  System.out.print("Celsius: "+ cOneDecimal );
    	  
    	  input.close(); 
      }      
}
