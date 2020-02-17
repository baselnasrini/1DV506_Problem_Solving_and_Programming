package mn223dn_assign2;
import java.util.Scanner;
public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Provide 10 integers: ");
		
		
		int i = 0;
		
		int secondLargest= 0;
		int largest=0;
		
		int input1 = sc.nextInt();
		largest = input1;
		
		int input2 = sc.nextInt();
		
		if (input2 > input1){
			secondLargest= largest;
			largest=input2;
		}
			else if (input2 < input1){
				
				secondLargest=input2;
				
			}
				
		while (i != 8 )
		{
		int input3 = sc.nextInt();
		        if (largest<input3){
	            
		        	secondLargest=largest;
	                largest=input3;
		        }
		        
		        
		        else if (input3>secondLargest){
		        	secondLargest=input3;
		        }
	   
	   i++;
		 
		}		

		System.out.print("The second largest integer is: "+secondLargest);	
		sc.close();
	}
}
