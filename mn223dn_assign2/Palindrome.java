package mn223dn_assign2;
import java.util.*;
public class Palindrome {
	
		public static void main(String [] args) {
			Scanner sc = new Scanner (System.in);
		
			System.out.print("Write a line of text and check if it's a palindrome!: ");
			String input = sc.nextLine();
			
			String lCase= input.toLowerCase();
			
			StringBuilder sb = new StringBuilder();
			StringBuilder st = new StringBuilder();		


			for (int i=0; i<lCase.length(); i++ ){
				if ( Character.isLetter(lCase.charAt(i)) )
					sb.append(lCase.charAt(i));
				}
			String text = sb.toString();
			
			
			for (int i=0; i<text.length(); i++){
				
				for (int e=text.length()-(i+1); e>=text.length()-(i+1); e--){
										
					if (text.charAt(i) == text.charAt(e)){
						st.append(text.charAt(i));
					
					}
					
							
					
				}
			}
			
			if ( st.toString().equals( text ) ) {
				System.out.println("The text is a palindrome.");
			}
			else {
				System.out.print("The text is not a palindrome.");
			}
				
			
		sc.close();	
		}
	}
