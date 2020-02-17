package mn223dn_assign1;

import java.util.Scanner;

public class Quote {
     public static void main(String[] args) {
    	 Scanner sc= new Scanner(System.in);
    	 
    	 System.out.print("Write a line of text: ");
    	 String quote=sc.nextLine();
    	  
    	 System.out.println("Quote: \"" + quote +"\"");
         
    	 sc.close ();
     }
}
