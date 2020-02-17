package mn223dn_assign2;
import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Provide a positive integer: ");
	
	int zero = 0 ;
	int odd= 0 ;
	int even= 0 ;
	
	String str= Integer.toString(sc.nextInt());	
	
		for(int i=0; i<str.length(); i++){
			
			if(Character.getNumericValue(str.charAt(i)) == 0)
				zero++;
			else if (Character.getNumericValue(str.charAt(i))%2 == 0 ){
				even++;
			}
			else {
				odd++;
			}
					
		}
		
		System.out.println("Zero: "+ zero);
		System.out.println("Odd "+ odd);
		System.out.println("Even: "+ even);
		
		
		
	sc.close();
	}
}
