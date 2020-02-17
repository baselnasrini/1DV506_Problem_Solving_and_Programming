package mn223dn_assign2;

public class Reverse {
	
	   public static void main(String[] args) {
	      char[] text = { '!', 'y', 's', 'a', 'E', ' ', 's', 'a', 'w', ' ', 
	         			's', 'i', 'h', 'T' };
	        

	     	System.out.println(text);
	     	
	     	
	     char[] reverse= new char[14];	
	     
	  
	     for (int i=0; i<reverse.length; i++) {

	         	for (int  a=text.length-(i+1); a>=text.length-(i+1); a--) {
	         	
	         		reverse[i]=text[a];
	         	}
	         	
	         	
	     }
	     
    	 System.out.print(reverse);

		
	}

}
