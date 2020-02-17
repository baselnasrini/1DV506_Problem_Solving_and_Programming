
package mn223dn_assign1;

import java.util.Scanner;

public class ShortName {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("First Name: ");
		
		String firstName= sc.nextLine();
		char firstChar= firstName.toUpperCase().charAt(0);
		
		System.out.print("Last Name: ");
		
		String lastName= sc.nextLine();
		
		char lastChar= lastName.toUpperCase().charAt(0);
		
		String last= lastName.substring(1,4).toLowerCase(); 
		
		System.out.print("Short Name: "+ firstChar +". "+lastChar+last);
		
		sc.close();
	}
}
 /* if the last name is less than four letters the compiler gives
   an error because we write that we want the substring
   to the fourth character */